package sprint4.övningsuppgift9Riddles;

public class RiddleProtocol {
    private static final int WAITING = 0;
    private static final int SENTRIDDLE = 1;
    private static final int ANOTHER = 2;

    private static final int NUMJOKES = 5;

    private int state = WAITING;
    private int currentRiddle = 0;

    private String[] gåtor = { "Vad är det som går och går och aldrig kommer till dörren?",
            "Vad blir större och större ju mer du tar bort?",
            "Vilket djur ser bäst?",
            "Vilken krydda i kryddskåpet är bäst på elektricitet?",
            "Vad är det man har framför sig men ändå inte kan se?" };
    private String[] answers = {"KLOCKA", "HÅL", "ZEBRA", "KANEL", "FRAMTID"};
    int wrongCount = 0; //hålla koll på hur många fel man har

    public String processInput(String theInput) {
        if(theInput != null){
            theInput = theInput.toUpperCase(); //gör input till uppercase så man kan skriva med stora eller små bokstäver
            System.out.println(theInput);
        }
        String theOutput = null;


        if (state == WAITING) {
            theOutput = gåtor[currentRiddle];
            state = SENTRIDDLE;
        } else if (state == SENTRIDDLE) {
            if (theInput.contains(answers[currentRiddle])) { //kollar om input innehåller svaret så man kan skriva t.ex. "en klocka"
                theOutput = "RÄTT!" + " Vill du ha en till? (j/n)";
                wrongCount = 0;
                state = ANOTHER;
            } else {
                if(wrongCount>=2) {
                    theOutput = "FEL!" + " Rätt svar är: " + answers[currentRiddle] + ". Vill du ha en till? (j/n)";
                    state = ANOTHER;
                    wrongCount = 0;
                }
                else {
                    wrongCount = wrongCount + 1;
                    theOutput = "FEL! " + (3-wrongCount) + " försök kvar. " + gåtor[currentRiddle];
                    state = SENTRIDDLE;
                }
            }

        } else if (state == ANOTHER) {
            if (theInput.equalsIgnoreCase("j")) {
                if (currentRiddle == (NUMJOKES - 1)){
                    currentRiddle = 0;
                }
                else{
                    currentRiddle++;}
                theOutput = gåtor[currentRiddle];
                state = SENTRIDDLE;
            }
            else if (theInput.equalsIgnoreCase("n")){
                theOutput = "Bye.";
                state = WAITING;
            }
            else {
                theOutput = "Skriv j eller n";
            }
        }
        return theOutput;
    }
}
