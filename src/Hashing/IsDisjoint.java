package Hashing;

import java.util.HashSet;

public class IsDisjoint {
    public static void main(String[] args) {
        int[] arr1 = {12, 34, 11, 9, 3};
        int[] arr2 = {2, 1, 5};
        System.out.println(isDisjoint(arr1,arr2)); // disjoint = different elements.
    }
    public static boolean isDisjoint(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        boolean isDisjoint = true;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                isDisjoint = false;
            }
        }
        return isDisjoint;
    }
}
