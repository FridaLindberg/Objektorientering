package sprint2.övningsuppgift9;

import org.junit.jupiter.api.Test;

public class LångaPersonerTest {
    LångaPersoner test = new LångaPersoner(true);

    @Test
    public void hittaLängdTest(){
        String rad = "31, 69, 167";
        assert(test.hittaLängd(rad) == 167);
    }
    @Test
    public void överTvåMeterTest(){
        int längd1 = 199;
        int längd2 = 175;
        int längd3 = 205;
        assert(test.överTvåMeter(längd1) == false);
        assert(test.överTvåMeter(längd2) == false);
        assert(test.överTvåMeter(längd3) == true);
    }
}
