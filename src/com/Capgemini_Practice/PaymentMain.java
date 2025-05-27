package com.Capgemini_Practice;

import java.util.Scanner;

abstract class PaymentMethod{
    double amount;
    public PaymentMethod(double amount) {
        this.amount = amount;
    }
    public abstract double calculateCharge();

    public void displayDetails() {
        System.out.println("Payment Method: " + this.getClass().getSimpleName());
        System.out.println("Transaction Amount (after charges): " + calculateCharge());
    }

}

class CreditCard extends PaymentMethod{
    public CreditCard(double amount) {
        super(amount);
    }
    @Override
    public double calculateCharge() {
        return amount + (amount * (2.5)/100);
    }
}

class DebitCard extends PaymentMethod{
    public DebitCard(double amount){
        super(amount);
    }
    @Override
    public double calculateCharge(){
        return amount + (amount * (1)/100);
    }
}

class UPI extends PaymentMethod{
    public UPI(double amount){
        super(amount);
    }
    @Override
    public double calculateCharge(){
        return amount;
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter payment method (Credit / Debit / UPI) : ");
        String method = sc.nextLine();
        if(method.equals("Credit")){
            CreditCard card = new CreditCard(amount);
            card.displayDetails();
        } else if (method.equals("Debit")) {
            DebitCard card = new DebitCard(amount);
            card.displayDetails();
        }else if(method.equals("UPI")){
            UPI card = new UPI(amount);
            card.displayDetails();
        }else System.out.println("Try again by entering a correct payment method");
    }
}
