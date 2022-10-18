package sprint2.uppgift4;

import org.junit.jupiter.api.Test;
import sprint2.TDDuppgift2.Bil;

public class BilTest {
    Bil b = new Bil(20000, 15000, 2500);

    @Test
    public void beräknaBensinTest(){
        assert(b.beräknaBensin() == 0.5);
        assert(b.beräknaBensin() != 5);
    }
    @Test
    public void beräknaKördaMil(){
        assert(b.beräknaKördaMil() == 5000);
    }
    @Test
    public void utskriftTest(){
        System.out.println(b.utskrift());
        assert(b.utskrift().equals("Antal körda mil: 5000.0\nAntal liter bensin: 2500.0\nFörbrukning per mil: 0.5"));
        assert(!b.utskrift().equals("hej"));
    }


}
