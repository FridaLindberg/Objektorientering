package sprint1.√∂vningsuppgift2;

public abstract class Fordon implements Printable {
    double hastighet;
    double vikt;

    public Fordon (double hastighet, double vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public double √§ndraHastighet(double nyHastighet){
        hastighet = nyHastighet;
        return hastighet;
    }
}
