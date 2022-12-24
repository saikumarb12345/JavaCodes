package Hashing;

import java.util.HashMap;

//Largest subarray with sum is 0
public class HMLargestSubArray {
    public static void main(String[] args) { //o(n)
        int[] arr = {15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> map = new HashMap<>();
        //(sum,index);
        int sum = 0;
        int len = 0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.println(len);
    }

}
