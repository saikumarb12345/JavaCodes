package Sorting;

import java.util.Arrays;

public class MergeSortPra {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,-2,-3};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

     static int[] merge(int[] left, int[] right) {
        int[] mixedArr = new int[left.length + right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mixedArr[k] = left[i];
                i++;
            }
            else {
                mixedArr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            mixedArr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mixedArr[k] = right[j];
            j++;
            k++;
        }
        return mixedArr;
    }
}
