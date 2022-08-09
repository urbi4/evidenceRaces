package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {



        RaceManager rm = new RaceManager();
        rm.addResults("Monaco1999",new RaceResult("Érik Comas","1:23.246"));
        rm.addResults("Monaco1999",new RaceResult("Michael Schumacher","1:21.190"));
        rm.addResults("Monaco1999",new RaceResult("Alain Prost","1:20.557"));
        rm.addResults("Monaco1999",new RaceResult("Damon Hill","1:21.825"));
        rm.addResults("Monaco1999",new RaceResult("Jean Alesi","1:21.948"));
        rm.addResults("Monaco1999",new RaceResult("Riccardo Patrese","1:22.117"));
        rm.addResults("Monaco1999",new RaceResult("Gerhard Berger","1:22.394"));
        rm.addResults("Monaco1999",new RaceResult("Karl Wendlinger","1:22.477"));
        rm.addResults("Monaco1999",new RaceResult("Michael Andretti","1:22.994"));
        rm.addResults("Monaco1999",new RaceResult("Ayrton Senna","1:21.552"));
        rm.printAllRaces("Monaco1999");
        System.out.println();



        RaceManager otherRaceManager = new RaceManager();
        otherRaceManager.addResults("Singapur2019",new RaceResult("Carlos Sainz Jr."," 1:11.417"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Pierre Gasly","1:11.041"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Kevin Magnussen","1:11.109"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Lewis Hamilton","1:10.166"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Valtteri Bottas","1:10.252"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Max Verstappen","1:10.641"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Sebastian Vettel","1:10.947"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Daniel Ricciardo","1:11.218"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Daniil Kvyat","1:11.271"));
        otherRaceManager.addResults("Singapur2019",new RaceResult("Alexander Albon","1:11.653"));
        otherRaceManager.printAllRaces("Singapur2019");

    }
}
