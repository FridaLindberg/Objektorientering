package sprint1.hederligeHarry;

public class Husvagnsannons extends FordonsAnnons {
    private int antalSängar;
    private boolean dusch;
    private boolean toalett;

    public Husvagnsannons(String rubrik, double pris, String märke, String färg, int antalSängar, boolean dusch, boolean toalett) {
        super(rubrik, pris, märke, färg);
        this.antalSängar = antalSängar;
        this.dusch = dusch;
        this.toalett = toalett;
    }

    public int getAntalSängar() {
        return antalSängar;
    }

    public void setAntalSängar(int antalSängar) {
        this.antalSängar = antalSängar;
    }

    public String getDusch() {
        if (dusch) {
            return "Ja";
        } else {
            return "Nej";
        }
    }

    public void setDusch(boolean dusch) {
        this.dusch = dusch;
    }

    public String getToalett() {
        if (toalett) {
            return "Ja";
        } else {
            return "Nej";
        }
    }

    public void setToalett(boolean toalett) {
        this.toalett = toalett;
    }

    @Override
    public void GetAnnonsText() {
        System.out.println(getRubrik() + ": En prisvärd och fin " + getFärg() + " " + getMärke() +
                " för endast " + getPris() + " kr. Antal sängar: " + antalSängar + " Dusch: " + getDusch() +
                " Toalett: " + getToalett());
    }

}

