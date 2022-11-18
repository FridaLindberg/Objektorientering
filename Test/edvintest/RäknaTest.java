package edvintest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RäknaTest {
    Räkna räkna = new Räkna();

    @Test
    public void räknaTest(){
        for(double i = 1; i<10; i++){
            double expected = (1/i);
            assertEquals(expected, räkna.inverse(i));
        }
    }

}