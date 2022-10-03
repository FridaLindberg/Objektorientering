package sprint1.övningsuppgift2;

public class Main {
    public void printInterface (Printable något){
        något.printMe();
    }
    Main() {
        Bil bil = new Bil(50, 300, 6, 4);
        Tåg tåg = new Tåg(130, 20000, 10);
        Cykel cykel = new Cykel(20, 30, 3, 3);
        Båt båt = new Båt(80, 100, 80);
        Bil bil2 = new Bil(30, 400, 5, 3);
        printInterface(bil);
        Hjulburen hjulburen = new Bil(30,200,5,3);
        System.out.println(cykel.getAntalHjul());
        System.out.println(hjulburen.getAntalHjul());

    }
    public static void main(String[] args) {
        Main main = new Main();
    }

}
