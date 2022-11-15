package sprint4.övningsuppgift13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class LäsFrånURL {
    public static void main(String[] args) throws Exception {
        URL orden = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");
        BufferedReader reader = new BufferedReader(new InputStreamReader(orden.openStream()));
        String line;
        int[] antal = new int[46];
        String längstaOrdet = "";
        int vanligasteLängden = 0;
        while ((line = reader.readLine()) != null) {
            int storlek = line.length();
            antal[storlek]++;
            if (line.length() > längstaOrdet.length()) {
                längstaOrdet = line;
            }
        }
        for (int i = 0; i < antal.length; i++) {
            if (antal[i] > antal[vanligasteLängden]) {
                vanligasteLängden = i;
            }
            if (antal[i] > 0) {
                System.out.println(antal[i] + " ord med " + i + " bokstäver");
            }
        }
        System.out.println("Längsta ordet är: " + längstaOrdet);
        System.out.println("Vanligaste längden är: " + vanligasteLängden + " bokstäver");

        reader.close();
    }
}
