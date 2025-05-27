package com.Java_Practice;
import java.util.Scanner;

class StrCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = search(input);
        System.out.println("Result: " + result);
    }

    static int search(String input) {
        if (input.isEmpty()) {
            return -1; // Handle empty input case
        }

        char head = input.charAt(0);
        int result = -1; // Default result if no match is found
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == head) {
                result = i;
                break;
            }
        }
        return result;
    }
}

