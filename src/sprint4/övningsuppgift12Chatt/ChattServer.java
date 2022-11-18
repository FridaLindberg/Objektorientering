package sprint4.övningsuppgift12Chatt;

import sprint4.övningsuppgift10Multiuser.Protocol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattServer extends Thread {

    private Socket clientSocket;
    private ChattWriters chattWriters;

    public ChattServer(Socket clientSocket, ChattWriters chattWriters) {
        this.clientSocket = clientSocket;
        this.chattWriters = chattWriters;
    }

    public void run() {


        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            chattWriters.addWriter(out);

            String frånKlient;

            while ((frånKlient = in.readLine()) != null) {
                for(PrintWriter writer: chattWriters.getWriters()){
                    writer.println(frånKlient);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
