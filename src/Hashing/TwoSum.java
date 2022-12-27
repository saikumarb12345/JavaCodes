package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {0,-1,2,-3,1};
        int target = -2;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> pair = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++){
            if(pair.containsKey(target-arr[i])){
                res[0] = pair.get(target-arr[i]);
                res[1] = i;
                return res;
            }else{
                pair.put(arr[i],i);
            }
        }
        return res;
    }
}
//
//package Java50;
//
//        import java.util.Arrays;
//        import java.util.HashMap;
//        import java.util.Map;
//
//public class TwoSum {
//    public static void main(String[] args) {
//        int[] arr = {2,6,5,8,9,11};
//        int target = 11;
//        int[] result = twoSum(arr,target);
//        System.out.println(Arrays.toString(result));
//    }
//    public static int[] twoSum(int[] arr,int target){
//        int[] result = new int[2];
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for (int i = 0; i < arr.length; i++) {
//            if(map.containsKey(target-arr[i])){
//                result[0] = map.get(target - arr[i]);
//                result[1] = i;
//                return result;
//            }
//            map.put(arr[i],i);
//        }
//        return result;
//    }
//}
