package sprint4.övningsuppgift4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receiver {
    public static void main(String[] args) throws IOException {
        int minPort = 35000;
        DatagramSocket socket = new DatagramSocket(minPort);
        byte[] data = new byte[256];
        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter frm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String dateTime = now.format(frm);
            System.out.println(message + ", " + dateTime);
        }
    }
}
