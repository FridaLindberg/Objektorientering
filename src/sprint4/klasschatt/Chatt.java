package sprint4.klasschatt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

public class Chatt extends JFrame implements ActionListener {
    String ip;
    InetAddress iadr;
    int port;
    InetSocketAddress group;
    NetworkInterface netIf;
    MulticastSocket socket;

    JPanel grund = new JPanel();
    JButton kopplaNed = new JButton("Koppla ned");
    JTextArea textArea = new JTextArea();
    JTextField textField = new JTextField();
    String användare;

    public Chatt() throws Exception {
        grund.setLayout(new BorderLayout());
        grund.add(kopplaNed, BorderLayout.NORTH);
        grund.add(textField, BorderLayout.SOUTH);
        grund.add(textArea);
        add(grund);
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textField.addActionListener(this);
        kopplaNed.addActionListener(this);

        ip = "234.235.236.238";
        iadr = InetAddress.getByName(ip);
        port = 20000;
        group = new InetSocketAddress(iadr, port);
        netIf = NetworkInterface.getByName("wlan1");
        socket = new MulticastSocket(port);
        socket.joinGroup(group, netIf);

        användare = JOptionPane.showInputDialog("Användarnamn");
        setTitle("Användare: " + användare);

        ChattReceiver receiver = new ChattReceiver(socket, textArea);
        receiver.tråd.start();
    }

    public void sendMessage(String text) throws IOException {

        byte[] data = text.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, iadr, port);
        socket.send(packet);
        textField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(textField)) {
            try {
                String toSend = användare + ": " + textField.getText();
                sendMessage(toSend);
            } catch (Exception ex) {
                System.out.println("Error");
                ex.printStackTrace();
            }
        }
        else if (e.getSource().equals(kopplaNed)) {
            try {
                sendMessage(användare + ": NEDKOPPLAD");
            } catch (IOException ex) {
                System.out.println("Error");
                ex.printStackTrace();
            }
            System.exit(0);
        }
    }

    public static void main(String[] args) throws Exception {
        new Chatt();
    }


}
