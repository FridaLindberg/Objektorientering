package sprint4.övningsuppgift10Multiuser;

import sprint4.övningsuppgift5.TelefonbokObjekt.DatabasObjekt;
import sprint4.övningsuppgift5.TelefonbokObjekt.KompisObjekt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMulti extends Thread {

    private Socket clientSocket;

    public ServerMulti(Socket clientSocket){
        this.clientSocket = clientSocket;
    }

    public void run(){


        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream())) {

            Protocol protocol = new Protocol();
            out.writeObject(protocol.processInput(null));
            String frånKlient;

            while((frånKlient = in.readLine()) != null) {
                out.writeObject(protocol.processInput(frånKlient));
                out.writeObject(protocol.processInput(null));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
