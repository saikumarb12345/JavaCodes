package Hashing;

import java.util.HashMap;

public class RepetiveElement {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,3};
        System.out.println(repetiveElement(arr));
    }
    public static int repetiveElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else {
                res = arr[i];
            }
        }
        return res;
    }
}
