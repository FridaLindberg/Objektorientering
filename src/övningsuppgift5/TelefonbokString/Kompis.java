package övningsuppgift5.TelefonbokString;

public class Kompis {

    private String namn;
    private String mobilnummer;
    private String födelsedag;
    private String email;

    public String getNamn() {
        return namn;
    }

    public String getMobilnummer() {
        return mobilnummer;
    }

    public String getFödelsedag() {
        return födelsedag;
    }

    public String getEmail() {
        return email;
    }

    public Kompis(String namn, String mobilnummer, String födelsedag, String email) {
        this.namn = namn;
        this.mobilnummer = mobilnummer;
        this.födelsedag = födelsedag;
        this.email = email;
    }

    public String kompisAsString(){
        String s = "Namn: " + namn + ", Mobilnummer: " + mobilnummer +
                ", Födelsedag: " + födelsedag + ", Email: " + email;
        return s;
    }
}
