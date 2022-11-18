package sprint4.övningsuppgift10Multiuser;

import sprint4.övningsuppgift5.TelefonbokObjekt.KompisObjekt;

import java.util.Arrays;
import java.util.List;

public class DatabasMulti {

    KompisMulti k1 = new KompisMulti("Frida", "0702782378" , "20/10", "frida.lindberg@gmail.com");
    KompisMulti k2 = new KompisMulti("Sigrun", "0725354739", "4/8", "mail.mail");
    KompisMulti k3 = new KompisMulti("David", "900288128", "31/7", "davidsmail.com");

   List<KompisMulti> lista = Arrays.asList(k1, k2, k3);

    public KompisMulti getKompis(String namn) {
        for(KompisMulti k: lista) {
            if(k.getNamn().equalsIgnoreCase(namn)){
                return k;
            }
        }
        return null;
    }
}
