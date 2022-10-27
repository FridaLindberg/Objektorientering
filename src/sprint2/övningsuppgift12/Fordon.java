package sprint2.övningsuppgift12;

import java.io.Serializable;

public abstract class Fordon implements Printable, Serializable {
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
