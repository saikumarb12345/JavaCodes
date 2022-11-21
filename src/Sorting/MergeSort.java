package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,10,-8,-3};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // MERGE SORT
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        // Take mid element and divide left and right arrays
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        // we have left & right then merge that elements
         return merge(left,right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mixOfArr = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < first.length &&  j < second.length){
            if(first[i] < second[j]){
                mixOfArr[k] = first[i];
                i++;
            }
            else {
                mixOfArr[k] = second[j];
                j++;
            }
            k++;
        }
        // In above while condition, if j condtion fails means it will add all the remaining of left arr to mix Arr
        while(i < first.length){
            mixOfArr[k] = first[i];
            i++;
            k++;
        }
        // In above while condition, if i condtion fails means it will add all the remaining of right arr to mix Arr
        while(j < second.length){
            mixOfArr[k] = second[j];
            j++;
            k++;
        }
        return mixOfArr;
    }
}
