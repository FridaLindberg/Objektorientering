package sprint4.övningsuppgift10Multiuser;

import sprint4.övningsuppgift5.TelefonbokObjekt.KompisObjekt;

import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMulti {

    int port = 33333;

    public ClientMulti() throws UnknownHostException {

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
                if(frånServer instanceof KompisMulti) {
                    System.out.println(((KompisMulti) frånServer).kompisAsString());
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
        new ClientMulti();
    }

}
