package sprint1.enums;

public enum RomerskSiffra {
    I (1),
    V (5),
    X (10),
    L (50),
    C (100),
    D (500),
    M (1000);

    private final int värde;

    RomerskSiffra (int värde){
        this.värde = värde;
    }

    public int getVärde() {
        return värde;
    }
}
