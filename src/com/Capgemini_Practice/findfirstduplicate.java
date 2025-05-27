package com.Capgemini_Practice;
import java.util.*;
public class findfirstduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> hset = new HashSet<>();
        boolean dup = false;
        for(int item : arr){
            if(hset.contains(item)){
                System.out.println(item);
                dup = true;
            }
            else{
                hset.add(item);
            }
        }
        if (!dup){
            System.out.println(-1);
        }
    }
}
