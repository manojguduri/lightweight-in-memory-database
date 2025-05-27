package com.Capgemini_Practice;

import java.util.*;

public class wordCounterHmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        Map<String, Integer> wordcount = new HashMap<>();
        for(String item : words){
            if(wordcount.containsKey(item)){
                int k = wordcount.get(item);
                k++;
                wordcount.replace(item,k);
            }
            else{
                wordcount.put(item , 1);
            }
        }
        System.out.println("The Word count is :");
        for (Map.Entry<String, Integer> entry : wordcount.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
