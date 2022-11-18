package sprint4.övningsuppgift5.TelefonbokString;

import java.util.Arrays;
import java.util.List;

public class Databas {

    Kompis k1 = new Kompis("Frida", "0702782378" , "20/10", "frida.lindberg@gmail.com");
    Kompis k2 = new Kompis("Sigrun", "0725354739", "4/8", "mail.mail");
    Kompis k3 = new Kompis("David", "900288128", "31/7", "davidsmail.com");

    List<Kompis> lista = Arrays.asList(k1, k2, k3);

    public String getKompis(String namn) {
        for(Kompis k: lista) {
            if(k.getNamn().equalsIgnoreCase(namn)){
                return k.kompisAsString();
            }
        }
        return null;
    }
}
