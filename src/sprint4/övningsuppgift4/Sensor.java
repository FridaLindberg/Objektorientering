package sprint4.övningsuppgift4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sensor extends JFrame implements ActionListener {
    JPanel grund = new JPanel();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Vilken stad?");
    JTextField field = new JTextField();
    JLabel label2 = new JLabel("Vilken temperatur?");
    JTextField field2 = new JTextField();

    JButton rapportera = new JButton("Rapportera");

    InetAddress toAdress = InetAddress.getLocalHost();
    int toPort = 35000;
    DatagramSocket socket = new DatagramSocket();

    Sensor() throws IOException {
        panel.setLayout(new GridLayout(2, 2));
        panel.add(label);
        panel.add(field);
        panel.add(label2);
        panel.add(field2);
        grund.setLayout(new BorderLayout());
        grund.add(panel, BorderLayout.NORTH);
        rapportera.addActionListener(this);
        grund.add(rapportera);
        add(grund);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String stad = field.getText();
        String temp = field2.getText();
        String toSend = stad + ", " + temp + " grader";
        byte[] data = toSend.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, toAdress, toPort);
        try {
            socket.send(packet);
        } catch (Exception exc) {
            System.out.println("Error");
        }

    }

    public static void main(String[] args) throws IOException {
        new Sensor();
    }
}
