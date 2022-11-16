package övningsuppgift5.TelefonbokObjekt;

import övningsuppgift5.TelefonbokString.Kompis;

import java.util.Arrays;
import java.util.List;

public class DatabasObjekt {

    KompisObjekt k1 = new KompisObjekt("Frida", "0702782378" , "20/10", "frida.lindberg@gmail.com");
    KompisObjekt k2 = new KompisObjekt("Sigrun", "0725354739", "4/8", "mail.mail");
    KompisObjekt k3 = new KompisObjekt("David", "900288128", "31/7", "davidsmail.com");

   List<KompisObjekt> lista = Arrays.asList(k1, k2, k3);

    public KompisObjekt getKompis(String namn) {
        for(KompisObjekt k: lista) {
            if(k.getNamn().equalsIgnoreCase(namn)){
                return k;
            }
        }
        return null;
    }
}
