package Hashing;

import java.util.HashMap;

// Given an Integer array of size n, find all elements that appear more than [n/3] times.
public class HM_Majority_Element {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = {1,3,2,5,5,3,5,5,1};
        for(int i=0;i<arr.length;i++){
              int num = arr[i];
//            if(hm.containsKey(num)){
//                hm.put(num,hm.get(num)+1);
//            }
//            else{
//                hm.put(num,1);
//            }
            hm.put(num,hm.getOrDefault(num,0) + 1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }
}
