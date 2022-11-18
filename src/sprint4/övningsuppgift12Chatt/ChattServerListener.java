package sprint4.övningsuppgift12Chatt;

import sprint4.övningsuppgift10Multiuser.ServerMulti;

import java.net.ServerSocket;
import java.net.Socket;

public class ChattServerListener {
    static int port = 33333;
    static ChattWriters chattWriters = new ChattWriters();
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(port)){
            while(true) {
                Socket socketToClient = serverSocket.accept();
                    ChattServer clientServer = new ChattServer(socketToClient, chattWriters);
                    clientServer.start();

                }
            }

        catch (Exception e){
            e.printStackTrace();
        }

    }
}
