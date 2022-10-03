package sprint1.övningsuppgift2;

public class Cykel extends Fordon implements Hjulburen{
    int antalVäxlar;
    int växelJustNu;
    int antalHjul = 2;

    public Cykel(double hastighet, double vikt, int antalVäxlar, int växelJustNu){
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this. växelJustNu = växelJustNu;
    }

    public int växla(int nyVäxel){
        växelJustNu = nyVäxel;
        return växelJustNu;
    }
    @Override
    public int getAntalHjul(){
        return antalHjul;
    }
    @Override
    public void printMe() {
        System.out.println("Cykel: Hastighet=" + hastighet + ", Vikt=" + vikt + ", Antal växlar=" + antalVäxlar +
                ", Växel just nu=" + växelJustNu);
    }


}
