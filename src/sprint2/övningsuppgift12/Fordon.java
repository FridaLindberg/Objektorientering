package sprint2.√∂vningsuppgift12;

import java.io.Serializable;

public abstract class Fordon implements Printable, Serializable {
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
