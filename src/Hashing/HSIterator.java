package Hashing;

import java.util.*;
import java.util.Iterator;

public class HSIterator {
    // Using set Iterator
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Bengaluru");
        cities.add("Chennai");
        cities.add("Delhi");
        System.out.println(cities);
//        Iterator it = cities.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        for(String city : cities){
//            System.out.println(city);
//        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //Sorted According to the input order
        lhs.add("Delhi");
        lhs.add("Chennai");
        lhs.add("Bengaluru");
        lhs.add(null);
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        // Sorted order
        ts.add("Delhi");
        ts.add("Chennai");
        ts.add("Bengaluru");
        System.out.println(ts);
    }
}
