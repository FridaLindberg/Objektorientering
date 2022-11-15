package sprint4.övningsuppgift15;

public class Main {
    public static void main(String[] args) {
        KöNumber<Double> nummerKö = new KöNumber<>();
        Kö<String> kö = new Kö<>();
        nummerKö.put(1.0);
        nummerKö.put(4.0);

        System.out.println(nummerKö.summera());

    }
}
