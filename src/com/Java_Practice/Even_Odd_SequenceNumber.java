package com.Java_Practice;
import java.util.Scanner;
public class Even_Odd_SequenceNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        CheckEvenOdd(input);
    }
    private static void CheckEvenOdd(int input) {
        boolean allEven = true;
        boolean allOdd = true;
        int maxDigit = -1;
        while(input > 0){
            int num = input % 10;
            input = input/10;
            if(Even(num)){
                allOdd = false;
            }else {
                allEven = false;
            }
            if (num > maxDigit) {
                maxDigit = num;
            }
        }
        if(allOdd || allEven){
            System.out.println(maxDigit);
        }
        else {
            System.out.println(-1);
        }
    }

    private static boolean Even(int num) {
        return num % 2 == 0;
    }
}
