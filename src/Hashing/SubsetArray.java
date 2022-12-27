package Hashing;

import java.util.HashSet;

public class SubsetArray {
    public static void main(String[] args) {
        int[] arr1 = {11,1,13,21,3,7};
        int[] arr2 = {11,3,7,1};
        System.out.println(isSubsetArray(arr1,arr2));
    }
    public static boolean isSubsetArray(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(!set.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
}
