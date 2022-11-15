package sprint4.övningsuppgift2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramReceiver {
    public static void main(String[] args) throws IOException {
        int minPort = 23000;
        DatagramSocket socket = new DatagramSocket(minPort);
        byte[] data = new byte[256];
        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Meddelande: " + message);
        }

    }
}
