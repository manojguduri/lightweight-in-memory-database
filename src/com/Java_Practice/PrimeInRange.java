package com.Java_Practice;

import java.util.Scanner;

public class PrimeInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers in the range [" + start + ", " + end + "]:");
        int primeCount = 0;

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                primeCount++;
            }
        }

        System.out.println("\nTotal number of prime numbers: " + primeCount);

        scanner.close();
    }

    // Method to check whether a number is prime or not
    public static boolean isPrime(int num) {
        // 1 and numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // If the number is divisible by any number from 2 to sqrt(num), it's not prime
            if (num % i == 0) {
                return false;
            }
        }

        // If no divisors are found, then it is a prime number
        return true;
    }
}

