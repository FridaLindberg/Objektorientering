package sprint3.övningsuppgift13;

public class Medicine extends Thread{
    String namn;
    int ggrPerMin;

    public Medicine(String namn, int ggrPerMin) {
        this.namn = namn;
        this.ggrPerMin = ggrPerMin;
    }
    @Override
    public void run(){
        int intervall = (60/ggrPerMin)*1000;
        while(!Thread.interrupted()) {
            try {
                Thread.sleep(intervall);
                System.out.println("Medicin: " + namn + " " + ggrPerMin + " gånger per minut");
            } catch (InterruptedException e){
                System.out.println("Interrupted exception slängdes");
                break;
            }
        }

    }
}
