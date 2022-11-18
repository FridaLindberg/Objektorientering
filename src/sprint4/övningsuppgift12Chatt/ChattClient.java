package sprint4.övningsuppgift12Chatt;

import sprint4.övningsuppgift10Multiuser.KompisMulti;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattClient extends JFrame implements ActionListener {

    int port = 33333;
    JPanel grund = new JPanel();
    JTextArea textArea = new JTextArea();
    JTextField textField = new JTextField();
    String användare;
    BufferedReader in;
    PrintWriter out;

    public ChattClient() throws UnknownHostException {

        grund.setLayout(new BorderLayout());
        grund.add(textField, BorderLayout.SOUTH);
        grund.add(textArea);
        add(grund);
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textField.addActionListener(this);

        användare = JOptionPane.showInputDialog("Användarnamn");
        setTitle("Användare: " + användare);

        InetAddress ip = InetAddress.getLocalHost();

        try{
            Socket socket = new Socket(ip, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String fromServer;

            while((fromServer = in.readLine()) != null) {
                textArea.append(fromServer + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            out.println(användare + ": " + textField.getText());
            textField.setText("");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnknownHostException {
        new ChattClient();
    }


}
