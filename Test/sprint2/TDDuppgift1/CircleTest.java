package sprint2.TDDuppgift1;

import org.junit.jupiter.api.Test;

public class CircleTest {

    Circle c = new Circle(10);

    @Test
    public void getAreaTest(){
        assert(c.getArea() == 314);
        assert(c.getArea() != 300);
    }
    @Test
    public void getCircumferenceTest(){
        assert(c.getCircumference() == 63);
        assert(c.getCircumference() != 40);

    }
}
