package sprint1.bilregister;

public class Huvudprogram {

    Bilägare ägare1 = new Bilägare("Frida", 18, "Ekerö");
    Bilägare ägare2 = new Bilägare("Sigrun", 40, "Nackademin");
    Bilägare ägare3 = new Bilägare("Edvin", 19, "Spånga");
    Bil bil1 = new Bil("ABC123", "Volvo", "c40", ägare1);
    Bil bil2 = new Bil ("GHT675", "Peguot", "nåt", ägare2);
    Bil bil3 = new Bil ("LOJ506", "BMW", "korv", ägare2);

    public Huvudprogram() {
        System.out.println(bil1);
        System.out.println(bil2);
        System.out.println(bil3);
        bil1.bytÄgare(ägare3);
        bil2.bytÄgare(ägare1);
        bil3.bytÄgare(ägare3);
        System.out.println(bil1);
        System.out.println(bil2);
        System.out.println(bil3);
    }

    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();









    }
}