package övningsuppgift5.TelefonbokString;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 33333;
    String fråga = "Vilken kompis vill du hitta?";

    public Server() {

        Databas db = new Databas();
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket socket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            out.println(fråga);
            String frånKlient;

            while((frånKlient = in.readLine()) != null) {
                String kompis = db.getKompis(frånKlient);
                if (kompis != null) {
                    out.println(kompis);
                } else {
                    out.println("Denna person finns inte");
                }
                out.println(fråga);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
