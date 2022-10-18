package sprint2.övningsuppgift10;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zone = sc.nextLine().trim();
        String tidsZon = "";
        if (zone.equalsIgnoreCase("Stockholm")) {
            tidsZon = "GMT+2";
        } else if (zone.equalsIgnoreCase("Toronto")) {
            tidsZon = "GMT-4";
        } else if (zone.equalsIgnoreCase("Shanghai")) {
            tidsZon = "GMT+8";
        }
        try {
            Instant i = Instant.now();
            ZoneId zoneId = ZoneId.of(tidsZon); //stockholm
            ZonedDateTime tid = i.atZone(zoneId);
            System.out.println(tid.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        } catch (Exception e) {
            System.out.println("Staden fanns inte");
        }


    }
}
