package sprint4.TCPintro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 55555;
    String ack = "message received";
    String hej = "Hej och välkommen";

    public Server() {
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket socket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            out.println(hej);
            String temp = "";
            while ((temp = in.readLine()) != null) {
                System.out.println(temp);
                out.println(ack + ": " + temp);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
