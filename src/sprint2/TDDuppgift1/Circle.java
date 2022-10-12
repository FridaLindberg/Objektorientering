package sprint2.TDDuppgift1;

public class Circle implements Figure {

    private int radie;

    public Circle (int radie){
        this.radie = radie;
    }
    @Override
    public int getArea(){
        return (int)(getRadie()*getRadie()*Math.PI + 0.5);
    }
    @Override
    public int getCircumference(){
        return (int)(getRadie()*2*Math.PI + 0.5);
    }

    public int getRadie() {
        return radie;
    }
}
