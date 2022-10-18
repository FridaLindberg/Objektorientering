package sprint2.övningsuppgift11;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Videobandspelare {

    public int räknaUtTidKvar(int längd, int använt){
        return längd - använt;
    }

    public int räknaUtProgrammetsLängd(LocalTime startTid, LocalTime slutTid) {
        Duration d = Duration.between(startTid, slutTid);
        return (int) d.toMinutes();
    }

    public boolean fårProgrammetPlats(int tidKvar, int programLängd){
        if(tidKvar>=programLängd){
            return true;
        }
        else{
            return false;
        }
    }


}
