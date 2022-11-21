package edvintest;

public class Räkna {

    double value = 0;
    public double inverse(double cvalue){
        if(cvalue!=0){
            value = (1/cvalue);
            return value;
        }
        else {
            throw new IllegalArgumentException();
        }
    } // hej kommentar 1
}
