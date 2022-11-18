package sprint4.övningsuppgift10Multiuser;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {
    static int port = 33333;
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(port)){
            while(true) {
                Socket socketToClient = serverSocket.accept();
                    ServerMulti clientHandler = new ServerMulti(socketToClient);
                    clientHandler.start();

                }
            }

        catch (Exception e){
            e.printStackTrace();
        }

    }
}
