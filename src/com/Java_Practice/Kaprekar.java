package com.Java_Practice;

/* Kaprekar Number
Given a number N, check if it is a
Kaprekar Number (a number whose
square, when split into two parts,
sums up to the number itself).
Input: 45
Output: Yes
Explanation: 452 = 2025 20 + 25 =
5. */

import java.util.*;

public class Kaprekar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numsqr = (int) Math.pow(num, 2);
        String squareStr = String.valueOf(numsqr);
        int len = squareStr.length();
        int half = len/2;

        String leftPart = squareStr.substring(0, half);
        String rightPart = squareStr.substring(half);

        int left = Integer.parseInt(leftPart);
        int right = Integer.parseInt(rightPart);

        if(left + right == num){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
