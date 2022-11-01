package sprint3.övningsuppgift13;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String namn1 = JOptionPane.showInputDialog("Vilken medicin?");
        int ggrPerMin1 = Integer.parseInt(JOptionPane.showInputDialog("Hur många gånger per minut?"));
        Medicine m1 = new Medicine(namn1, ggrPerMin1);
        String namn2 = JOptionPane.showInputDialog("Vilken medicin?");
        int ggrPerMin2 = Integer.parseInt(JOptionPane.showInputDialog("Hur många gånger per minut?"));
        Medicine m2 = new Medicine(namn2, ggrPerMin2);

        m1.start();
        m2.start();

        Thread.sleep(30000); //söver main

        m1.interrupt();
        m2.interrupt();
    }
}
