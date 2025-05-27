package com.collections;

public class runners {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 15; i < 100; i = i +15 ) {
            list.insert(i);
        }
        list.reverse();
        list.show();
    }
}
