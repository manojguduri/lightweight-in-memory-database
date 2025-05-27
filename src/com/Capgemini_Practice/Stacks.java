package com.Capgemini_Practice;
import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        Deque<Character> stk1 = new ArrayDeque<>();
        for(char item : str1.toCharArray()){
            stk1.push(item);
            if(item == '*'){
                stk1.pop();
                stk1.pop();
            }
        }
        String s =  "";
        Object[] array = stk1.reversed().toArray();
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        System.out.println(s);
    }
}
