package sprint2.uppgift6;

import org.junit.jupiter.api.Test;

class VäxelTest {
    Växel x = new Växel();

    @Test
    public void beräknaVäxelTest(){
        int pris = 10;
        int betalning = 15;
        assert(x.beräknaVäxel(pris, betalning) == 5);
    }
    @Test
    public void beräknaMängdValörTest(){
        int växel = 5;
        int valör = 2;
        assert(x.beräknaMängdValör(växel, valör) == 2);
    }
    @Test
    public void subtraheraVäxelTest(){
        int växel = 5;
        int valör = 2;
        int mängdValör = 2;
        assert(x.beräknaVäxelKvar(växel, valör, mängdValör) == 1);

    }

}