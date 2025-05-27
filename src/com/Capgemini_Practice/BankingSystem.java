package com.Capgemini_Practice;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message, double amount){
        super(message + amount + ".");
    }
}

class InvalidAmountException extends RuntimeException{
    InvalidAmountException(String message){
        super(message);
    }
}

class BankAccount{
    String accountNumber;
    String accountHolder;
    double balance;
    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount < 0){
            throw new InvalidAmountException("Error: Invalid amount. Cannot deposit negative values.");
        }else{
            balance += amount;
            System.out.println("Deposited: ₹"+amount);
            System.out.println("Final Balance: ₹"+getBalance());
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount < 0){
            throw new InvalidAmountException("Error: Invalid amount. Cannot withdraw negative values.");
        }else if (amount > balance){
            throw new InsufficientFundsException("Error: Insufficient funds. Cannot withdraw ₹",amount);
        }else {
            balance -= amount;
            System.out.println("Withdrawn: ₹"+amount);
            System.out.println("Final Balance: ₹"+getBalance());
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args){
        BankAccount account = new BankAccount("2100", "Mahesh", 0);
        try{
            account.deposit(5000);
        }catch (InvalidAmountException e){
            System.out.println(e.getMessage());
            System.out.println("Final Balance: ₹"+account.getBalance());
        }
        try {
            account.withdraw(2000);
        }catch (InvalidAmountException | InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("Final Balance: ₹"+account.getBalance());
        }
        try{
            account.deposit(-1000);
        }catch (InvalidAmountException e){
            System.out.println(e.getMessage());
            System.out.println("Final Balance: ₹"+account.getBalance());
        }
        try {
            account.withdraw(-500);
        }catch (InvalidAmountException | InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("Final Balance: ₹"+account.getBalance());
        }
        try {
            account.withdraw(5000);
        }catch (InvalidAmountException | InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("Final Balance: ₹"+account.getBalance());
        }
        try {
            account.withdraw(1000);
        }catch (InvalidAmountException | InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("Final Balance: ₹"+account.getBalance());
        }

    }
}
