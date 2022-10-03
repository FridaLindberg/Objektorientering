package sprint1.övningsuppgift2;

public abstract class Fordon implements Printable {
    double hastighet;
    double vikt;

    public Fordon (double hastighet, double vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public double ändraHastighet(double nyHastighet){
        hastighet = nyHastighet;
        return hastighet;
    }
}
