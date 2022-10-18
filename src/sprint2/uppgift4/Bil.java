package sprint2.uppgift4;

public class Bil {
    private double dagensMätare;
    private double förraMätaren;
    private double förbrukadBensin;

    public Bil() {
    }

    public Bil(double dagensMätare, double förraMätaren, double förbrukadBensin) {
        this.dagensMätare = dagensMätare;
        this.förraMätaren = förraMätaren;
        this.förbrukadBensin = förbrukadBensin;
    }
    public double beräknaKördaMil(){
        return getDagensMätare() - getFörraMätaren();
    }
    public double beräknaBensin(){
        return getFörbrukadBensin() / beräknaKördaMil();
    }
    public String utskrift(){
        return "Antal körda mil: " + beräknaKördaMil() + "\nAntal liter bensin: " + getFörbrukadBensin() +
                "\nFörbrukning per mil: " + beräknaBensin();

    }

    public double getDagensMätare() {
        return dagensMätare;
    }

    public double getFörraMätaren() {
        return förraMätaren;
    }

    public double getFörbrukadBensin() {
        return förbrukadBensin;
    }

    public void setDagensMätare(double dagensMätare) {
        this.dagensMätare = dagensMätare;
    }

    public void setFörraMätaren(double förraMätaren) {
        this.förraMätaren = förraMätaren;
    }

    public void setFörbrukadBensin(double förbrukadBensin) {
        this.förbrukadBensin = förbrukadBensin;
    }
}
