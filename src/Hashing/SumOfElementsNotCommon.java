package Hashing;

import java.util.HashMap;
import java.util.Map;

//Sum of all elements that are not common.
public class SumOfElementsNotCommon { // O(n)
    public static void main(String[] args) {
        int[] arr1 = {1,5,3,8};
        int[] arr2 = {5,4,6,7};
        System.out.println(sumDistinctElements(arr1,arr2));
    }
    public static int sumDistinctElements(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],1 + map.get(arr1[i]));
            }
            else{
                map.put(arr1[i],1);
            }
            if(map.containsKey(arr2[i])){
                map.put(arr2[i],1 + map.get(arr2[i]));
            }
            else{
                map.put(arr2[i],1);
            }
        }
        int sum = 0;

        for(Map.Entry entry : map.entrySet()){
            if(Integer.parseInt(entry.getValue().toString()) == 1){
                sum = sum + Integer.parseInt(entry.getKey().toString());
            }
        }
        return sum;
    }
}
