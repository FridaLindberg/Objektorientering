package sprint4.TCPintro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    int port = 55555;
    String mess = "Hejhej";


    public Client() throws UnknownHostException {

        InetAddress ip = InetAddress.getLocalHost();

        try (Socket socket = new Socket(ip, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            String fromServer;

            while (true) {
                out.println(mess);
                fromServer = in.readLine();
                System.out.println(fromServer);
                Thread.sleep(3000);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnknownHostException {
        new Client();
    }
}
