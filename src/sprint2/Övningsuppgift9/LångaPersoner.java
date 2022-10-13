package sprint2.Övningsuppgift9;

import java.io.*;

public class LångaPersoner {

    public LångaPersoner(){
        String förstaRad;
        String andraRad;
        try(BufferedReader reader = new BufferedReader(new FileReader("personuppgifter.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("långaPersoner.txt"))){
            while((förstaRad = reader.readLine()) != null){
                 andraRad = reader.readLine();
                int längd = hittaLängd(andraRad);
                if(överTvåMeter(längd) == true){
                    writer.write(förstaRad + "\n" + andraRad + "\n");
                }
            }
        } catch (Exception e) {
            System.out.println("Det blev fel");
            e.printStackTrace();
        }

    }
    public int hittaLängd(String rad){
        String[] array = rad.split(",");
        return Integer.parseInt(array[2].trim());
    }
    public boolean överTvåMeter(int längd){
        if(längd>200){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LångaPersoner program = new LångaPersoner();
    }
}
