package Hashing;

import java.util.HashMap;
import java.util.Set;

// Iteration on Hashmap
public class HashmapIteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Bharath",100);
        hm.put("china",150);
        hm.put("usa",50);
        hm.put("uk",30);
        hm.put("Indonesia",10);
        hm.put("Combodia",5);
        System.out.println(hm);
        System.out.println(hm.get("usa"));

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys){ //forEach Loop
            System.out.println("key="+k+", value="+hm.get(k));
        }
    }
}
