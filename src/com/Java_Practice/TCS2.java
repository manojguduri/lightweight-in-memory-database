package com.Java_Practice;
/* Problem Statement:
You are given an array containing N integers where
only one element is unique (appears exactly once),
while all other elements appear twice. Find and
return the unique element.
Example:
Input: arr = (5, 3, 2, 3, 2)
output :5 */
import java.util.*;

public class TCS2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        if((n%2) == 0){
            System.out.println(-1);
            return;
        }
        else {
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int unique = 0;
            for (int num : arr) {
                unique ^= num;  // XOR operation
            }
            System.out.println(unique);
        }
    }
}