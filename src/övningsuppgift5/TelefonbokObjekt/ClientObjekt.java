package övningsuppgift5.TelefonbokObjekt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientObjekt {

    int port = 33333;

    public ClientObjekt() throws UnknownHostException {

        InetAddress ip = InetAddress.getLocalHost();

        try(Socket socket = new Socket(ip, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

            Scanner sc = new Scanner(System.in);
            String tillServer;
            Object frånServer;



            while (true) {
                System.out.println(in.readObject());
                tillServer = sc.nextLine();
                out.println(tillServer);
                frånServer = in.readObject();
                if(frånServer instanceof KompisObjekt) {
                    System.out.println(((KompisObjekt) frånServer).kompisAsString());
                }
                else {
                    System.out.println(frånServer);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnknownHostException {
        new ClientObjekt();
    }

}
