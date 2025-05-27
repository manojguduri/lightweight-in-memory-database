package com.Capgemini_Practice;

import java.util.*;

public class temp {
    public static void main(String[] args) {
        int[] arr = new int[127];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        int count = 0;
        int m = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>count){
                count++;
                m = i;
            }
        }
        System.out.println((char) m);
    }
}
