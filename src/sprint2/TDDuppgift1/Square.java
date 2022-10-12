package sprint2.TDDuppgift1;

public class Square implements Figure{

    private int length;
    private int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
        return getLength() * getWidth();
    }
    @Override
    public int getCircumference() {
        return getLength()*2 +  getWidth()*2;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
