package sprint4.övningsuppgift1;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
    int port = 44444;
    String message = "I am Server";

    public Server(){
        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)){

            while(true){
                out.println(message);
                Thread.sleep(1000);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args)  {
        new Server();
    }
}
