package Sorting;

import java.util.ArrayList;
import java.util.List;

public class DisNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(disNumber(arr));
    }
    public static List<Integer> disNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                list.add(index+1);
            }
        }
        return list;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
