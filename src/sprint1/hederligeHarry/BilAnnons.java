package sprint1.hederligeHarry;

public class BilAnnons extends FordonsAnnons {
    private String modell;
    private boolean sommardäck;

    public BilAnnons(String rubrik, double pris, String märke, String färg, String modell, boolean sommardäck) {
        super(rubrik, pris, märke, färg);
        this.modell = modell;
        this.sommardäck = sommardäck;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getSommardäck() {
        if (sommardäck){
            return "Ja";
        }
        else {
            return "Nej";
        }
    }
    public void setSommardäck(boolean sommardäck) {
        this.sommardäck = sommardäck;
    }
    @Override
    public void GetAnnonsText() {
        System.out.println(getRubrik() + ": En väldigt fin " + getFärg() + " " + getMärke() + " " + modell +
                " för endast " + getPris() + " kr. Sommardäck: " + getSommardäck());
    }


}
