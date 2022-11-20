package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        boolean swapped;
        int length1 = arr.length;
        for(int i=0;i<length1;i++){
            swapped=false;
            for(int j=1;j<length1-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j, j - 1);
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    private static void swap(int[] arr,int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
