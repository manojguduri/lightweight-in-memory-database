package com.Java_Practice;

import java.util.*;
class TCS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] p = new int[tc];
        int[] q = new int[tc];
        int[] r = new int[tc];
        for(int i = 0; i<tc; i++){
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for(int i = 0; i<=tc; i++){
            int count = 0;
            if (p[i] == q[i] && p[i] == r[i]) {
                System.out.println(0);
                continue;
            }
            if (p[i] != q[i] && p[i] != r[i] && q[i]!=r[i]) {
                System.out.println(-1);
                continue;
            }
            int totalSum = p[i] + q[i] + r[i];
            int big = Math.max(p[i], Math.max(q[i], r[i]));
            int rem = totalSum - big;
            int x = 1;
            while (big > 0) {
                rem += 2;
                big--;
                count++;
                if (rem / 2 == big && x == 1) {
                    System.out.println(count);
                    x = 0;
                }
            }
            tc--;
        }
    }
}
