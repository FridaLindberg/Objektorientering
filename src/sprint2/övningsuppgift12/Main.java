package sprint2.övningsuppgift12;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public void printInterface (Printable något){
        något.printMe();
    }
    Main() throws IOException, ClassNotFoundException {
        Bil bil = new Bil(50, 300, 6, 4);
        Tåg tåg = new Tåg(130, 20000, 10);
        Cykel cykel = new Cykel(20, 30, 3, 3);
        Båt båt = new Båt(80, 100, 80);
        Bil bil2 = new Bil(30, 400, 5, 3);
        List<Fordon> lista = Arrays.asList(bil, tåg, cykel, båt, bil2);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("f.ser"));
        out.writeObject(lista);
        out.flush();
        System.out.println("success");

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.ser"));
        List<Fordon> f = (List<Fordon>)in.readObject();
        for(Fordon fordon: f){
            fordon.printMe();
        }

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Main main = new Main();
    }

}
