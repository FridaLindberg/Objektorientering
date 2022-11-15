package sprint4.TCPintro;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
     int port = 55555;
     String mess = "Hejhej";


     public Client() throws UnknownHostException {

         InetAddress ip = InetAddress.getLocalHost();

         try(Socket socket = new Socket(ip, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)){

             while(true){
                 out.println(mess);
                 Thread.sleep(3000);
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
