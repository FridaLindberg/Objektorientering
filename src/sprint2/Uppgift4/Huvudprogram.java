package sprint2.Uppgift4;

import sprint2.TDDuppgift2.Bil;

import javax.swing.*;
import java.util.Scanner;

public class Huvudprogram {
    public static void main(String[] args) {
        Bil bil = new Bil();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Dagens mätarställning?");
            bil.setDagensMätare(sc.nextDouble());
            System.out.println("Förra årets mätarställning?");
            bil.setFörraMätaren(sc.nextDouble());
            System.out.println("Liter förbrukad bensin?");
            bil.setFörbrukadBensin(sc.nextDouble());
            System.out.println(bil.utskrift());
        }
    }
}
