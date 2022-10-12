package sprint2.TDDuppgift1;

import org.junit.jupiter.api.Test;

public class SquareTest {
    Square s = new Square(5,7);

    @Test
    public void getAreaTest(){
        assert(s.getArea() == 35);
        assert(s.getArea() != 25);
    }
    @Test
    public void getCircumferenceTest(){
        assert(s.getCircumference() == 24);
        assert(s.getCircumference() != 10);
    }


}
