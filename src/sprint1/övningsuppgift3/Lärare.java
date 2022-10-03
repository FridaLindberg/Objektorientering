package sprint1.övningsuppgift3;

import java.util.ArrayList;

public class Lärare extends Person{
    String namnKod;
    ArrayList<Kurs> hållerKurser;

    public Lärare(String namn, int ålder, String namnkod) {
        super(namn, ålder);
        this.namnKod = namnkod;
        hållerKurser = new ArrayList<>();
    }
}
