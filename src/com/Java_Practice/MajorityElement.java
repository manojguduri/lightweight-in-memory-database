package com.Java_Practice;
/*Given an array a of n elements. Find the majority element in the array. A majority element in an array a of size n is an element that appears more than n/2 times in the array.
Input Format:
First line - n, the size of array
Second line - al the n elements
Output Format:
Print the majority element if present else print -1.
Sample Input:
4
1 2 2 2
Sample Output:
2
Explanation: int[n
2 is present 3 times which is greater than (4 / 2).*/
import java.util.Scanner;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int majorityElement = findMajorityElement(arr);
        System.out.println(majorityElement);
    }
    private static int findMajorityElement(int[] arr) {
        int candidate = findCandidate(arr);
        if (isMajority(arr, candidate)) {
            return candidate;
        }
        return -1;
    }
    private static int findCandidate(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        return candidate;
    }
    private static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int value : arr) {
            if (value == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }
}
