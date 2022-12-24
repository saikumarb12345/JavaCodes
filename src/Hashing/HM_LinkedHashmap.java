package Hashing;

import java.util.LinkedHashMap;

public class HM_LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Bharath",100);
        lhm.put("china",150);
        lhm.put("usa",50);

        System.out.println(lhm);
    }
}
