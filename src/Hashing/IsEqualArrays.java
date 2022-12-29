package Hashing;

import java.util.HashSet;

//Check if two arrays are equal or not
public class IsEqualArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,4,0,2};
        int[] arr2 = {2,4,5,0,1,2};
        System.out.println(isEqualArrays(arr1,arr2));
    }
    public static boolean isEqualArrays(int[] arr1,int[] arr2){ //
        HashSet<Integer> set = new HashSet<>();
        boolean isEqual = true;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!set.contains(arr2[i])){
                isEqual = false;
            }
        }
        return isEqual;
    }
}
