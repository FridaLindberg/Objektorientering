package sprint4.övningsuppgift1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    int port = 44444;

    public Client() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        try(Socket socket = new Socket(ip, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String temp = "";
            while((temp = in.readLine()) != null){
                System.out.println(temp);

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws UnknownHostException {
        new Client();
    }
}
