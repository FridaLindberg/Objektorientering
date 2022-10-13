package sprint2.Uppgift6;

import java.util.Scanner;

public class Växel {

    int[] allaValörer = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public int beräknaVäxel(int pris, int betalning) {
        return betalning - pris;
    }

    public int beräknaMängdValör(int växel, int valör) {
        return växel / valör;
    }

    public int beräknaVäxelKvar(int växel, int valör, int mängdValör){
        return växel - mängdValör*valör;
    }
    public void skrivUtVäxeln(int växel){
        System.out.println("Total växel: " + växel);
        for (int i = 0; i<allaValörer.length; i++){
            int valör = allaValörer[i];
            int mängdValör = beräknaMängdValör(växel, valör);
            System.out.println("Antal " + valör + ":or - " + beräknaMängdValör(växel, valör));
            växel = beräknaVäxelKvar(växel, valör, mängdValör);
        }
    }
    public void huvudProgram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vad är priset?");
        int pris = sc.nextInt();
        System.out.println("Vad betalar du?");
        int betalning = sc.nextInt();
        int växel = beräknaVäxel(pris, betalning);
        skrivUtVäxeln(växel);
    }

    public static void main(String[] args) {
        Växel program = new Växel();
        program.huvudProgram();
    }

}

