package com.Capgemini_Practice;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        Set<Integer> hset = new HashSet<>();
        hset.add(0);
        hset.add(1);
        hset.add(2);
        hset.add(3);
        hset.add(4);
        System.out.println(hset);

        System.out.println(hset.contains(4));

        Set<String> iset = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            iset.add(String.valueOf(i));
        }

        System.out.println(iset);
        System.out.println(iset.contains(String.valueOf(4)));
        System.out.println(hset.containsAll(iset));
    }
}
