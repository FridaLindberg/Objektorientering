package sprint4.övningsuppgift4b;

import javax.swing.*;
import java.io.IOException;
import java.net.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receiver extends JFrame {

    JPanel grund = new JPanel();
    JTextArea textArea = new JTextArea(30,20);

    Receiver() throws IOException {
        grund.add(textArea);
        add(grund);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String ip = "234.235.236.237";
        InetAddress iadr = InetAddress.getByName(ip);
        int minPort = 35000;
        InetSocketAddress group = new InetSocketAddress(iadr,
                minPort);
        NetworkInterface netIf =
                NetworkInterface.getByName("wlan1");
        MulticastSocket socket = new MulticastSocket(minPort);
        socket.joinGroup(group, netIf);



        byte[] data = new byte[256];
        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            LocalDate now = LocalDate.now();
            textArea.append(message + ", " + now);
        }
    }

    public static void main(String[] args) throws IOException {
        new Receiver();

    }
}

