package sprint1.hederligeHarry;

public abstract class FordonsAnnons {
    private String rubrik;
    private double pris;
    private String märke;
    private String färg;

    public FordonsAnnons(String rubrik, double pris, String märke, String färg) {
        this.rubrik = rubrik;
        this.pris = pris;
        this.märke = märke;
        this.färg = färg;
    }

    public FordonsAnnons() {
    }

    public String getRubrik() {
        return rubrik;
    }

    public void setRubrik(String rubrik) {
        this.rubrik = rubrik;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    abstract void GetAnnonsText();
}
