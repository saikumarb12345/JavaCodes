package Sorting;

import java.util.Arrays;

public class Bubble_Pra {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        int length = arr.length;
        boolean swap;
        for(int i=0;i<length;i++){
            swap = false;
            for (int j = 1; j < length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
    }
}
