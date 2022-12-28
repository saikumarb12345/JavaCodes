package Hashing;

import java.util.HashMap;

public class MaxDistance {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,2,1,4,5,2,5};
        System.out.println(max_Distance(arr));
    }
    public static int max_Distance(int[] arr){ // O(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        int max_Dist = 0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
            else{
                max_Dist = Math.max(max_Dist,i - map.get(arr[i]));
            }
        }
        return max_Dist;
    }
}
