package sprint1.hederligeHarry;

public class MotorcykelAnnons extends FordonsAnnons {
    private String drivtyp;
    private double motorvolym;

    public MotorcykelAnnons(String rubrik, double pris, String märke, String färg, String drivtyp, double motorvolym) {
        super(rubrik, pris, märke, färg);
        this.drivtyp = drivtyp;
        this.motorvolym = motorvolym;
    }

    public String getDrivtyp() {
        return drivtyp;
    }

    public void setDrivtyp(String drivtyp) {
        this.drivtyp = drivtyp;
    }

    public double getMotorvolym() {
        return motorvolym;
    }

    public void setMotorvolym(double motorvolym) {
        this.motorvolym = motorvolym;
    }
    @Override
    public void GetAnnonsText(){
        System.out.println(getRubrik() + ": En mycket kraftfull " + getFärg() + " " + getMärke() + " med " + drivtyp + " och motorvolym "
        + motorvolym);
    }
}
