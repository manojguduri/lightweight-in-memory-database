package com.Java_Practice;
import java.util.*;
public class IslandLife {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int N = scan.nextInt();
        int E = scan.nextInt();
        int D = scan.nextInt();
        int minDays = FindMinDays(N,E,D);
        System.out.println(minDays);
    }
    static int FindMinDays (int N, int E, int D) {
        int SweetsNeeded = D * E;
        int Buyable_days = D-Math.floorDiv(D, 7);
        if (Buyable_days * N < SweetsNeeded) {
            return -1;
        } else {
            return Math.ceilDiv(SweetsNeeded,N);
        }
    }
}
