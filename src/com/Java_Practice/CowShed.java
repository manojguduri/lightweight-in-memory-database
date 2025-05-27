package com.Java_Practice;

import java.util.*;
public class CowShed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. Of test Cases : ");
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(),K = sc.nextInt(), turns = 0,left = 1,right = N;
            while (left <= right) {
                if (turns % 2 == 0) left += K;
				else right -= K;        
                turns++;
			}
            System.out.println(turns % 2 == 0 ? left : right);
		}
	}
}