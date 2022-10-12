package sprint2.TDDuppgift2;

import javax.swing.*;

public class Huvudprogram {
    public static void main(String[] args) {
        Bil bil = new Bil();
        String dagensMätare = JOptionPane.showInputDialog("Dagens mätarställning?");
        String förraMätaren = JOptionPane.showInputDialog("Förra årets mätarställning?");
        String förbrukadBensin = JOptionPane.showInputDialog("Liter förbrukad bensin?");

        bil.setDagensMätare(Double.parseDouble(dagensMätare));
        bil.setFörraMätaren(Double.parseDouble(förraMätaren));
        bil.setFörbrukadBensin(Double.parseDouble(förbrukadBensin));

        System.out.println(bil.utskrift());
    }
}
