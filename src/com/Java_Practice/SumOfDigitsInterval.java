package com.Java_Practice;/*Given two integers A and B. Write a program to find the sum S of digits of all numbers in the interval [A, B].
Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings while reading the input or while printing, as these contribute to the standard output.
Input Format:The input contains two integers, A and B separated by a single white space.
 Constraints:
0 <= A<= B <= 10^15.
Output Format:
The output contains S.
Sample Input1:
50 55
Sample Output1:
45
Explanation1:
A=50. B=55.
S=(5+0)+(5+1)+(5+2)+(5+3)+(5+4)+(5+5)=5+6+7+8+9+10=45.
Sample Input2:
28 31
Sample Output2:
28
Explanation2:
A=28. B=31.
S=(2+8)+(2+9)+(3+0)+(3+1)=10+11+3+4=28.*/
import java.util.Scanner;

public class SumOfDigitsInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        // Calculate and print the sum of digits of all numbers in the interval [A, B]
        int result = sumOfDigitsInInterval(A, B);
        System.out.println(result);
    }
    static int sumOfDigitsInInterval(int A , int B){
        int result = 0;
        for (int i = A; i <= B ; i++) {
            result += individualSum(i);
        }
        return result;
    }
    static int individualSum(int A){
        int sum = 0;
        while ( A > 0){
            sum += A%10;
            A /= 10;
        }
        return sum;
    }
}
