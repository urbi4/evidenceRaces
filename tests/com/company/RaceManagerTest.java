package com.company;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RaceManagerTest {


    @Test
    public void addResultsIsNull(){
        RaceManager rm = new RaceManager();
        assertThrows(IllegalArgumentException.class, () ->{
            rm.addResults(null,new RaceResult("Kimmi Raikkonen","1:15.666"));
        });


    }
    @Test
    public void printAllRacesNull() {
        RaceManager rm = new RaceManager();
        assertThrows(NullPointerException.class,() ->{
            rm.printAllRaces(null);
        });
    }

    @Test
    public void convertTimeBadFormat(){
        assertThrows(IllegalArgumentException.class, () -> {
            RaceManager.formatTime("");
        });

    }
}