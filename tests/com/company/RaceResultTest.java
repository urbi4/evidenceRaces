package com.company;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceResultTest {


    @Test
    public void addResultTime() {
        RaceResult raceResult = new RaceResult("Kimmi Raikonnen","1:15.101");
        String expected = "1:15.101";
        Assert.assertEquals(expected, raceResult.getTime());
    }

    @Test
    public void addResultName() {
        RaceResult raceResult = new RaceResult("Luis Hamilton","1:11.122");
        String expected = "Luis Hamilton";
        assertEquals(expected, raceResult.getName());
    }

    @Test
    public void timeIsNull() {
        try {
            RaceResult raceResult = new RaceResult("Luis Hamilton", null);
            assertEquals(null, raceResult.getTime());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void nameIsNull() {
        try{
        RaceResult raceResult = new RaceResult(null,"1:11.122");
        assertEquals(null,raceResult.getName());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}