package sprint1.övningsuppgift2;

public class Bil extends Fordon implements Hjulburen {
    int antalVäxlar;
    int växelJustNu;
    int antalHjul = 4;

    public Bil (double hastighet, double vikt, int antalVäxlar, int växelJustNu){
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public int växla(int nyVäxel){
        växelJustNu = nyVäxel;
        return växelJustNu;
    }
    @Override
    public void printMe(){
        System.out.println("Bil: Hastighet=" + hastighet + ", Vikt=" + vikt + ", Antal växlar=" + antalVäxlar +
                ", Växel just nu=" + växelJustNu);
    }
    @Override
    public int getAntalHjul(){
        return antalHjul;
    }
}
