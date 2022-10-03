package sprint1.bilregister;

public class Bil {
    private String regNummer;
    private String märke;
    private String modell;
    private Bilägare ägare;

    public Bil(String regNummer, String märke, String modell, Bilägare ägare) {
        this.regNummer = regNummer;
        this.märke = märke;
        this.modell = modell;
        this.ägare = ägare;
    }

    public void bytÄgare (Bilägare nyÄgare) {
        this.ägare = nyÄgare;
    }

    public String getRegNummer() {
        return regNummer;
    }

    public void setRegNummer(String regNummer) {
        this.regNummer = regNummer;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public Bilägare getÄgare() {
        return ägare;
    }

    public void setÄgare(Bilägare ägare) {
        this.ägare = ägare;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNummer='" + regNummer + '\'' +
                ", märke='" + märke + '\'' +
                ", modell='" + modell + '\'' +
                ", ägare=" + ägare +
                '}';
    }
}

