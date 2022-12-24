package Hashing;

import java.util.HashSet;

//Count distinct elements
public class HSCount_Distinct {
    public static void main(String[] args) {
        int[] nums = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){ //o(n)
            set.add(nums[i]);
        }
        System.out.println(set.size());
    }

}
