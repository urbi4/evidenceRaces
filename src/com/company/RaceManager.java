package com.company;

import java.util.*;

public class RaceManager {

    private HashMap<String, Set<RaceResult>> data;

    public RaceManager() {
        data = new HashMap<>();
    }

    public HashMap<String, Set<RaceResult>> getData() {
        return data;
    }

    public void addResults(String name, RaceResult raceResult){


        if(!data.containsKey(name)){
            data.put(name,new HashSet<>());
        }
        data.get(name).add(raceResult);
    }

    public List<RaceResult> getAllResults(String name){
        if(data.containsKey(name) == false)
            return new ArrayList<>();

        Set<RaceResult> results = data.get(name);
        List<RaceResult> ret = new ArrayList<>(results);
        Comparator<RaceResult> comparator = new RaceResult.ByTimeComparator();
        Collections.sort(ret, comparator);
        return ret;
    }

    public void printAllRaces(String name){
        if(name == null) throw new NullPointerException("Name je nastaveno na null, nelze vypsat vsechny závody.");
        List<RaceResult> ret = getAllResults(name);
        int position = 1;
        System.out.println("\n---------- Výsledky závodů " + name+ " -------\n");
        for (RaceResult raceResult : ret) {
            System.out.println(position+". "+ raceResult.getName()+" "+ raceResult.getTime());
            position++;
        }
    }

    public static String formatTime(String time){
        if(!time.contains(".") || !time.contains(":") || time.isEmpty()) throw new IllegalArgumentException("Zadana hodnota time je neplatna, nelze konvertovat čas.");
        String ret;
        if(time.startsWith(" ")) ret = time.substring(time.indexOf("")+1);
        else ret = time;
        String[] column = ret.split(":");
        StringBuilder sb = new StringBuilder();
        sb.append(column[0]).append(":").append(column[1]);
        return sb.toString();
    }
}

