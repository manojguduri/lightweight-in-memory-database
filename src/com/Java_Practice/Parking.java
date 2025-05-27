package com.Java_Practice;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int result = findCommonFuel(N,a,b,c,d);
        if(result == -1){
            System.out.println("No same fuel levels are found.");
        }
        else System.out.println("A same fuel level of "+result+" is found");
    }

    private static int findCommonFuel(int N, int a, int b, int c, int d) {
        for (int i = 0; i < N; i++) {
            int fuelInLane1 = b+(a*i);
            for (int j = 0; j < N; j++) {
                int fuelInLane2 = d + (c * j);
                if (fuelInLane1 == fuelInLane2) {
                    return fuelInLane1;
                }
            }
        }
        return -1;
    }
}
