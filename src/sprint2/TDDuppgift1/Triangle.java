package sprint2.TDDuppgift1;

public class Triangle implements Figure {
    //liksidig triangel

    private int width;
    private int height;

    public Triangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public int getArea(){
        return (getWidth() * getHeight()) / 2;
    }
    @Override
    public int getCircumference(){
        return getWidth() * 3;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
