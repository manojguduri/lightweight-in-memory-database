package com.Capgemini_Practice;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            arraylist.add(i);
        }
        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrList.add(i+6);
        }

        System.out.println(arraylist);
        System.out.println(arrList);
        arrList.addAll(4,arraylist);
        System.out.println(arrList);

        Iterator<Integer> it = arrList.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
            System.out.println(arrList);
        }

    }
}
