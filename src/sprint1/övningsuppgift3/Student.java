package sprint1.övningsuppgift3;

import java.util.ArrayList;

public class Student extends Person {
    String id;
    ArrayList<Kurs> kurser;

    public Student(String namn, int ålder, String id) {
        super(namn, ålder);
        this.id = id;
        kurser = new ArrayList<>();
    }
    public void läggTillKurs(Kurs kurs){
        kurser.add(kurs);
    }
}
