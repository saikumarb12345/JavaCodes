package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class MissingElementsRange {
    public static void main(String[] args) {
        //int[] arr = {10,12,11,15};
        int[] arr = {1,14,11,51,15};
        int low = 50;
        int high = 55;
        missingElements(arr, low, high);
    }
    public static void missingElements(int[] arr,int low,int high){
        HashSet<Integer> set = new HashSet<>();
        int[] res = {};
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int diff = high - low;
        for (int i = low; i <= high; i++) {
            if(!set.contains(i)){
                System.out.println(i + " ");
            }
        }
    }
}
