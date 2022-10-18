package sprint2.övningsuppgift11;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class VideobandspelareTest {

    Videobandspelare test = new Videobandspelare();

    @Test
    public void räknaUtTidKvarTest(){
        int längd = 20;
        int användTid = 5;
        assert(test.räknaUtTidKvar(längd, användTid)==15);
    }

    @Test
    public void räknaUtProgrammetsLängdTest(){
        LocalTime startTid = LocalTime.parse("13:56");
        LocalTime slutTid = LocalTime.parse("15:04");
        assert(test.räknaUtProgrammetsLängd(startTid, slutTid) == 68); //tid i minuter
    }

    @Test
    public void fårProgrammetPlatsTest(){
        int tidKvar1 = 80;
        int tidKvar2 = 10;
        int programLängd = 68;
        assert(test.fårProgrammetPlats(tidKvar1, programLängd));
        assert(!test.fårProgrammetPlats(tidKvar2, programLängd));
    }

}