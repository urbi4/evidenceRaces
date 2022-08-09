package com.company;

import java.util.Comparator;

public class RaceResult implements Comparable<RaceResult> {

    private String name;
    private String time;

    public static class ByTimeComparator implements Comparator<RaceResult>{

        @Override
        public int compare(RaceResult a, RaceResult b) {
            return a.time.compareTo(b.time);
        }
    }

    public void setName(String name) {
        try {
            if (name == null) throw new NullPointerException("Jmeno je null, nelze nastavit jmeno.");
            if (name.equals("")) throw new IllegalArgumentException("Nelze nastavit prazdne jmeno.");
        }catch (NullPointerException | IllegalArgumentException e){
            System.out.println("Exception: " +e.getClass().getName()+ " ma chybovou hlasku: " +e.getMessage());
        }


        this.name = name;
    }

    public void setTime(String time) {
        try {
            if (time == null) throw new NullPointerException("Cas je null, nelze nastavit cas.");
            if (time.equals("")) throw new IllegalArgumentException("Nelze nastavit cas na prazdny string.");
        }
        catch (NullPointerException | IllegalArgumentException e){
            System.out.println("Exception: " +e.getClass().getName()+ " ma chybovou hlasku: " + e.getMessage());
        }
        String ret = RaceManager.formatTime(time);
        this.time = ret;
    }


    public RaceResult(String name, String time) {
        setName(name);
        setTime(time);
    }

    @Override
    public int compareTo(RaceResult raceResult) {
        return this.time.compareTo(raceResult.time);
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Result{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
