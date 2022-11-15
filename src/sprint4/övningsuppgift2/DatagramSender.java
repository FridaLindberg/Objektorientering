package sprint4.övningsuppgift2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

public class DatagramSender {
    public static void main(String[] args) throws IOException, InterruptedException {
        String message1 = "Tänkvärt citat";
        String message2 = "Kaffe är svaret";
        String message3 = "hej";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(message1);
        lista.add(message2);
        lista.add(message3);

        InetAddress toAdr = InetAddress.getByName("172.20.200.191");
        int toPort = 23000;
        DatagramSocket socket = new DatagramSocket();

        while(true) {
            for(String citat: lista) {
                byte[] data = citat.getBytes();
                DatagramPacket packet = new DatagramPacket(data, data.length, toAdr, toPort);
                socket.send(packet);
                Thread.sleep(5000);
            }
        }







    }
}
