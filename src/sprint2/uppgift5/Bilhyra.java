package sprint2.uppgift5;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Bilhyra {

    public static void main(String[] arg) {
        String antalDagarString = JOptionPane.showInputDialog
                ("Ange antal dagar");
        String prisPerDagString = JOptionPane.showInputDialog
                ("Ange pris per dag");
        String bilModell = JOptionPane.showInputDialog
                ("Ange bilmodell");
        try {
            int antalDagar = Integer.parseInt(antalDagarString);
            double dagsPris = Double.parseDouble(prisPerDagString);
            double totPris = dagsPris * antalDagar;
            String s = String.format("Totalt pris för %s: %.2f",
                    bilModell, totPris); //formaterad string
            showMessageDialog(null, s);
        } catch (NumberFormatException e) {
            System.out.println("Fel blev det");
            e.printStackTrace();
        }
    }
}

