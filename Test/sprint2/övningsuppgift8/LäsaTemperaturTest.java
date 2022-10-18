package sprint2.övningsuppgift8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LäsaTemperaturTest {

    LäsaTemperatur test = new LäsaTemperatur();

    @Test
    public void beräknaHögstaTest(){
        List<Double> list = Arrays.asList(12.5, 13.9, 10.2, 5.6, 7.8);
        assert(test.beräknaHögsta(list) == 13.9);
        assert(test.beräknaHögsta(list) != 5.6);
    }
    @Test
    public void beräknaLägstaTest(){
        List<Double> list = Arrays.asList(2.3, 5.6, 14.5, 12.3, 14.0);
        assert(test.beräknaLägsta(list) == 2.3);
        assert(test.beräknaLägsta(list) != 12.3);
    }
    @Test
    public void beräknaMedelVärde(){
        List<Double> list = Arrays.asList(2.3, 5.6, 14.5, 12.3, 14.0);
        assert(test.beräknaMedelVärde(list) == 9.74);
    }



}
