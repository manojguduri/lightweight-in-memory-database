package com.collections;

import java.util.*;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
            return;
        }
        Node nd1 = head;
        while (nd1.next != null){
            nd1 = nd1.next;
        }
        nd1.next = node;
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        int i = 0;
        if(index < 0){
            throw new IndexOutOfBoundsException("Index cannot be negavtive.");
        }
        if(index == 0){
            insertAtStart(data);
            return;
        }
        Node nd1 = head;
        while(nd1.next != null && i<index-1){
            nd1 = nd1.next;
            i++;
        }
        node.next = nd1.next;
        nd1.next = node;
    }
    public void deleteAtStart(){
        Node node = head;
        if (head == null) {
            throw new NoSuchElementException("List is empty. Cannot delete.");
        }
        head = node.next;
    }
    public void deleteAt(int index){
        Node node = head;
        int i = 0;
        if(index < 0){
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        if(index >= length()){
            throw new IndexOutOfBoundsException("Index cannot be greater than length of the linked list");
        }
        if (index == 0){
            deleteAtStart();
            return;
        }
        while (node.next != null && i<index-1){
            node = node.next;
            i++;
        }
        node.next = node.next.next;
    }
    public void deleteAtEnd(){
        Node node = head;
        if (head == null) {
            throw new NoSuchElementException("List is empty. Cannot delete.");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        while(node.next.next!= null){
            node = node.next;
        }
        node.next = null;
    }
    public int length() {
        Node node = head;
        int i = 0;
        while (node != null) {
            i++;
            node = node.next;
        }
        return i;
    }
    public void reverse(){
        Node node = head;
        Node previous = null;
        Node next;
        while (node != null){
            next = node.next;
            node.next = previous;
            previous = node;
            node = next;
        }
        head = previous;
    }
    public void show(){
        Node node =  head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

