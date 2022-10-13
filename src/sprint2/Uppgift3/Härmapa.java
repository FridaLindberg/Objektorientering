package sprint2.Uppgift3;

import java.util.Scanner;

public class Härmapa {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Skriv något");
            String s = sc.nextLine();
            System.out.println("Du skrev: " + s);
        }
    }
}
