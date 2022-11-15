package sprint4.klasschatt;

import javax.swing.*;
import java.io.IOException;
import java.net.*;

public class ChattReceiver implements Runnable{

    Thread tråd = new Thread(this);
    MulticastSocket socket;
    JTextArea textArea;

    public ChattReceiver(MulticastSocket so, JTextArea area) throws Exception {
        socket = so;
        textArea = area;
    }

    @Override
    public void run() {
        byte[] data = new byte[1024];
        while (true) {
            try {
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                textArea.append(message + "\n");
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {

    }
}
