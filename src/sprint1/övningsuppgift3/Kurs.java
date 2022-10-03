package sprint1.övningsuppgift3;

import java.util.ArrayList;

public class Kurs {
    String namn;
    Lärare lärare;
    ArrayList<Student> studenter;

    public Kurs (String namn, Lärare lärare){
        this.namn = namn;
        this.lärare = lärare;
        studenter = new ArrayList<>();
    }
}
