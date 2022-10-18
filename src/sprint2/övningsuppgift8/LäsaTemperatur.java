package sprint2.övningsuppgift8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LäsaTemperatur {
    String sträng;

    public List<Double> skapaLista() {
        List<Double> allaVärden = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("temperatur.txt"))) {
            while ((sträng = reader.readLine()) != null) {
                sträng = sträng.replace(",", ".");
                Double värde = Double.parseDouble(sträng);
                allaVärden.add(värde);
            }
        } catch (Exception e) {
            System.out.println("Det blev fel");
            e.printStackTrace();
        }
        return allaVärden;
    }

    public Double beräknaHögsta(List<Double> allaVärden) {
        double högsta = 0;
        for (Double d : allaVärden) {
            if (d > högsta) {
                högsta = d;
            }
        }
        return högsta;
    }
    public Double beräknaLägsta(List<Double> allaVärden) {
        double lägsta = 100;
        for (Double d : allaVärden) {
            if (d < lägsta) {
                lägsta = d;
            }
        }
        return lägsta;
    }

    public LäsaTemperatur() {
        List<Double> allaVärden = skapaLista();
        double högstaVärdet = beräknaHögsta(allaVärden);
        double lägstaVärdet = beräknaLägsta(allaVärden);
        double medelVärde = beräknaMedelVärde(allaVärden);

        System.out.println("Högsta värdet: " + högstaVärdet);
        System.out.println("Lägsta värdet: " + lägstaVärdet);
        System.out.println("Medelvärde: " + medelVärde);
    }

    public static void main(String[] args) {
        LäsaTemperatur program = new LäsaTemperatur();
    }

    public double beräknaMedelVärde(List<Double> allaVärden) {
        double summa = 0;
        for(Double d: allaVärden){
            summa = summa+d;
        }
        return summa/allaVärden.size();
    }
}
