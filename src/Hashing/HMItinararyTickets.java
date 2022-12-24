package Hashing;

import java.util.HashMap;

public class HMItinararyTickets {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; // starting point
            }
        }
        return null;
    }
    public static void main(String[] args) { //o(n)
        HashMap<String,String> set = new HashMap<>();
        set.put("Chennai","Benagaluru");
        set.put("Mumbai","Delhi");
        set.put("Goa","Chennai");
        set.put("Delhi","Goa");

        String start = getStart(set);
        System.out.print(start);
        for(String key : set.keySet()){
            System.out.print(" -> " + set.get(start));
            start = set.get(start);
        }
    }
}
