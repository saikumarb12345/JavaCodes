package Hashing;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        //Create Hashmap
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert - O(1) --> Insert (Key,Values)
        hm.put("Bharath",100);
        hm.put("china",150);
        hm.put("usa",50);
        //hm.put("Bharath",130);

        System.out.println(hm);

//        Get - O(1) --> Get values by using keys
//        int population = hm.get("Bharath");
//        System.out.println(population); // Returns 100
//        System.out.println(hm.get("Japan")); // Returns Null if there is no key in hashmap
//
//        ContainsKey - O(1) --> Check for key
//        System.out.println(hm.containsKey("Bharath")); // True
//        System.out.println(hm.containsKey("Indonesia")); // False

        //Remove - O(1)
//        System.out.println(hm.remove("china")); // Returns Value(150)
//        System.out.println(hm.remove("Indonesia")); // Returns null if key doesn't exist
//        System.out.println(hm);

        // Size
        //System.out.println("size of hashmap is " +hm.size()); // Returns size of the HashMap

        // Is Empty
//        System.out.println(hm.isEmpty()); // false
//        hm.clear();                       // clears all the Hashmap
//        System.out.println(hm.isEmpty()); // true


    }
}
