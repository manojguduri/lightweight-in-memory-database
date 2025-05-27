package com.Capgemini_Practice;

interface StringFunction{
    String run(String str);
}

public class Expression {
    public static void main(String[] args) {
        StringFunction exclaim = (str -> str + "!");
        StringFunction ask = (str -> str + "?");
        printFormatted("Hello", exclaim);
        printFormatted("Who are you", ask);
    }
    public static void printFormatted(String str, StringFunction format){
        System.out.println(format.run(str));
    }
}
