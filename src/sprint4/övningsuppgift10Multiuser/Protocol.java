package sprint4.övningsuppgift10Multiuser;

public class Protocol {
    private static final int WAITING = 0;
    private static final int SENT = 1;
    private static final int ANOTHER = 2;

    private int state = WAITING;

    DatabasMulti db = new DatabasMulti();
    KompisMulti dbResponse;

    public Object processInput(String theInput) {
        Object theOutput = null;

        if (state == WAITING) {
            theOutput = "Vilken kompis vill du hitta?";
            state = SENT;
        } else if (state == SENT) {
            dbResponse = db.getKompis(theInput);
                if (dbResponse != null) {
                    theOutput = dbResponse;
                } else {
                    theOutput = "Denna person finns inte";
                }
                state = WAITING;

            }
        return theOutput;
    }
}
