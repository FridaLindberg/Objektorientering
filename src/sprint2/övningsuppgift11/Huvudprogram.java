package sprint2.övningsuppgift11;

import java.time.LocalTime;
import java.util.Scanner;

public class Huvudprogram {

    Videobandspelare v = new Videobandspelare();

    public Huvudprogram() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hur långt är bandet?");
            int bandLängd = sc.nextInt();
            System.out.println("Hur mycket är använt?");
            int användTid = sc.nextInt();
            sc.nextLine(); //för att scanna det som finns kvar
            System.out.println("När börjar programmet?");
            LocalTime startTid = LocalTime.parse(sc.nextLine());
            System.out.println("När slutar programmet?");
            LocalTime slutTid = LocalTime.parse(sc.nextLine());
            boolean fårPlats = v.fårProgrammetPlats(v.räknaUtTidKvar(bandLängd, användTid),
                    v.räknaUtProgrammetsLängd(startTid, slutTid));
            if (fårPlats) {
                System.out.println("Programmet får plats :)");
            } else {
                System.out.println("Programmet får inte plats :(");
            }
        } catch (Exception e) {
            System.out.println("Inmatningen blev fel, försök igen");
        }
    }

    public static void main(String[] args) {
        Huvudprogram v = new Huvudprogram();
    }
}
