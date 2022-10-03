package sprint1.bilregister;

public class Bilägare extends Person {
    public Bilägare(String namn, int ålder, String adress) {
        super(namn, ålder, adress);

    }

    @Override
    public String toString() {
        return "Bilägare{" + "namn='" + getNamn() + '\'' + ", ålder='" + getÅlder() + '\'' + ", adress='" + getAdress() +
                '\'' + '}';
    }
}
