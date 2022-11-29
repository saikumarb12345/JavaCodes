package Strings;

import java.util.Arrays;

public class Comparision {
    public static void main(String[] args) {
        String a = "sai";
        String b = "sai";
        System.out.println(a == b); // true

        String name1 = new String("Sai");
        String name2 = new String("Sai");
        System.out.println(name1 == name2); // comparator false

        // Method
        System.out.println(name1.equals(name2)); // true
        // System.out.println(name1[0]); --> error
        // to access index use charAt method
        System.out.println(name1.charAt(0)); // s

        System.out.println(new int[]{2,3,4,5,6,7});
        System.out.println(Arrays.toString(new int[]{2,3,4,5,6,7}));

        System.out.println(23 + "a"); // 23a
        System.out.println('a' + 3); // 100(97 + 3) ASCII
        System.out.println("sas" + 'p');
    }
}

