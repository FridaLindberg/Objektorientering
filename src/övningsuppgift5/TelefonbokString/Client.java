package övningsuppgift5.TelefonbokString;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    int port = 33333;

    public Client() throws UnknownHostException {

        String ip = "172.20.200.181";

        try(Socket socket = new Socket(ip, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            Scanner sc = new Scanner(System.in);
            String tillServer;
            String frånServer;


            while (true) {
                System.out.println(in.readLine());
                tillServer = sc.nextLine();
                out.println(tillServer);
                frånServer = in.readLine();
                System.out.println(frånServer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnknownHostException {
        new Client();
    }

}
