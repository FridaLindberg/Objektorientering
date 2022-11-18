package sprint4.övningsuppgift5.TelefonbokObjekt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerObjekt {

    int port = 33333;
    String fråga = "Vilken kompis vill du hitta?";

    public ServerObjekt() {

        DatabasObjekt db = new DatabasObjekt();
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket socket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {

            out.writeObject(fråga);
            String frånKlient;

            while((frånKlient = in.readLine()) != null) {
                KompisObjekt kompis = db.getKompis(frånKlient);
                if (kompis != null) {
                    out.writeObject(kompis);
                } else {
                    out.writeObject("Denna person finns inte");
                }
                out.writeObject(fråga);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServerObjekt();
    }
}
