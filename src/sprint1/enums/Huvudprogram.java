package sprint1.enums;

public class Huvudprogram {
    public static void main(String[] args) {
        for (RomerskSiffra r: RomerskSiffra.values()){
            System.out.println(r + "=" + r.getVärde());
        }
    }
}
