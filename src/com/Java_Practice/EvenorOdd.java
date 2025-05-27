package com.Java_Practice;

import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int num) {
        // A number is even if it is divisible by 2 without a remainder
        return num % 2 == 0;
    }
}

