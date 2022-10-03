package sprint1.övningsuppgift2;

public class Tåg extends Fordon {
    int antalVagnar;

    public Tåg(double hastighet, double vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public int kopplaVagn(int nyaVagnar) {
        antalVagnar += nyaVagnar;
        return antalVagnar;
    }

    @Override
    public void printMe() {
        System.out.println("Tåg: Hastighet=" + hastighet + ", Vikt=" + vikt + ", Antal vagnar=" + antalVagnar);
    }
}
