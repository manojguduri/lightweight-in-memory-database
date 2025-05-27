package com.Java_Practice;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseHalfArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int n = scan.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter the elements of the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int start = 0;
        int end = n-1;
        int mid = start + (end - start)/2;
        ReverseHalf(arr, start, mid);
        ReverseHalf(arr, mid+1, end);
        System.out.println(Arrays.toString(arr));
    }

    static void ReverseHalf(int[] arr, int start, int end) {
        while(end>start){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
