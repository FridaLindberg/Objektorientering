package sprint2.TDDuppgift1;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    Triangle t = new Triangle(6, 8);

    @Test
    public void getAreaTest(){
        assert(t.getArea() == 24);
        assert(t.getArea() != 48);
    }
    @Test
    public void getCircumferenceTest(){
        assert(t.getCircumference() == 18);
        assert(t.getCircumference() != 24);
    }
}
