package com.Java_Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardsDeckPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Cards : ");
        int N = sc.nextInt();
        int[] result = findOrder(N);
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] findOrder(int N) {
        int[] result = new int[N];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                queue.add(queue.poll());
            }
            result[queue.poll() - 1] = i;
        }
        
        return result;
    }
}