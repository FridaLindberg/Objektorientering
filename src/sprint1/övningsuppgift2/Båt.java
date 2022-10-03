package sprint1.övningsuppgift2;

public class Båt extends Fordon {
    double dödvikt;

    public Båt (double hastighet, double vikt, double dödvikt){
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public void sväng(){
        System.out.println("Svänger");
    }
    @Override
    public void printMe(){
        System.out.println("Båt: Hastighet=" + hastighet + ", Vikt=" + vikt + ", Dödvikt=" + dödvikt);
    }
}
