package com.Capgemini_Practice;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int age = sc.nextInt();
            try {
                validate(age);
            }catch (InvalidAgeException e){
                System.out.println(e.getMessage());
            }
        }
    }
    static void validate(int age) throws InvalidAgeException {
        if(age < 18 || age > 60){
            throw new InvalidAgeException("Invalid age: ",age);
        }else {
            System.out.println("Valid age: "+age);
        }
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String message, int age){
        super(message + age);
    }
}