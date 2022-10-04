package sprint1.bilregister;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {

    Bilägare frida = new Bilägare("Frida", 18, "Ekerö");
    Bil bil = new Bil("LNH80F", "Toyota", "Rav4", frida);
    Bilägare edvin = new Bilägare("Edvin", 19, "Spånga");
    Bil bil2 = new Bil("kjhsk", "Volvo", "C40", frida);

    @Test
    void setÄgare(){
        assert(bil2.getÄgare() == frida);
        bil2.setÄgare(edvin);
        assert(bil2.getÄgare() == edvin);
    }

    @Test
    void bytÄgare() {
        assert(bil.getÄgare() == frida);
        bil.bytÄgare(edvin);
        assert(bil.getÄgare() == edvin);
        assert (bil.getÄgare() != frida);
    }

    @Test
    void getÄgare() {
        assert(bil.getÄgare() == frida);
    }
}