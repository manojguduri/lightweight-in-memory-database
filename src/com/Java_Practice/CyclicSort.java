package com.Java_Practice;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
    int[] arr = {4,5,6,1,3,9,2,8,7};
    CSort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void CSort( int[] arr){
        int  i =0;
        while( i < arr.length){
            i = 0;
            
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
