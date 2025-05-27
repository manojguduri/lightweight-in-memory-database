package com.Java_Practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,6,5,4,7,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length- i -1;
            int max = findMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }

    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    static int findMaxIndex (int[] arr, int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }


    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}