package Sorting;

import java.util.Arrays;

public class Selection_Pra {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        selection1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection1(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = getmaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getmaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
