package sprint1.hederligeHarry;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BilAnnons bilAnnons = new BilAnnons("Bra bil", 400000,
                "Volvo", "röd", "C40", true);
        MotorcykelAnnons motorcykelAnnons = new MotorcykelAnnons("Motorcykel", 45_000, "BMV",
                "svart", "kedja", 800);
        Husvagnsannons husvagnsannons = new Husvagnsannons("Fin husvagn", 100_000, "Kabe", "vit",
                2, true, false);
        BilAnnons bilAnnons1 = new BilAnnons("Begagnad bil", 20_000, "Toyota", "röd",
                "Aygo", true);
        List<FordonsAnnons> fordon = Arrays.asList(bilAnnons, motorcykelAnnons, husvagnsannons, bilAnnons1);

        for (FordonsAnnons element : fordon) {
            element.GetAnnonsText();
        }

    }
}

