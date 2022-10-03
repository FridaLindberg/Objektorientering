package sprint1.bilregister;

public class Person {
    private String namn;
    private int ålder;
    private String adress;

    public Person (){}

    public Person(String namn, int ålder, String adress) {
        this.namn = namn;
        this.ålder = ålder;
        this.adress = adress;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namn='" + namn + '\'' +
                ", ålder=" + ålder +
                ", adress='" + adress + '\'' +
                '}';
    }
}
