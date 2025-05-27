package com.Capgemini_Practice;

class Bank{
    int acc_num;
    String acc_holder;
    double acc_balance;
    public void displayAcc_details() {
        System.out.println("Account Number : "+ acc_num + "\nAccount Holder Name : " + acc_holder + "\nAccount Balance : " + acc_balance);
    }

    public int getAcc_num() {
        return acc_num;
    }

    public String getAcc_holder() {
        return acc_holder;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_details(int acc_num, String acc_holder, double acc_balance) {
        this.acc_num = acc_num;
        this.acc_holder = acc_holder;
        this.acc_balance = acc_balance;
    }
    public void deposit (double amount){
        this.acc_balance += amount;
        System.out.println("Rs."+amount + " is credited to your account.");
        System.out.println("Your new Balance : " + acc_balance);
    }
    public void withdraw (double amount){
        this.acc_balance -= amount;
        System.out.println("Rs."+amount + " is debited from your account.");
        System.out.println("Your new Balance : " + acc_balance);
    }
}

class HDFC extends Bank{
    String Branch;

    @Override
    public void displayAcc_details() {
        System.out.println("Account Number : "+ acc_num + "\nAccount Holder Name : " + acc_holder + "\nAccount Balance : " + acc_balance + "\nBranch : "+Branch);
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }
}

class SBI extends HDFC{
    String IFSC;
    @Override
    public void displayAcc_details() {
        System.out.println("Account Number : "+ acc_num + "\nAccount Holder Name : " + acc_holder + "\nAccount Balance : " + acc_balance + "\nBranch : "+Branch
        + "\nIFSC Code : "+ IFSC);
    }
    public void setAcc_details(int acc_num, String acc_holder, double acc_balance, String Branch, String IFSC) {
        this.acc_num = acc_num;
        this.acc_holder = acc_holder;
        this.acc_balance = acc_balance;
        this.Branch = Branch;
        this.IFSC = IFSC;
    }
    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    public String getIFSC() {
        return IFSC;
    }
}
public class inheritance {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.setAcc_details(63371, "Manoj", 78000, "Ongole", "SBI1010002");
        HDFC hdfc = new HDFC();
        hdfc.setAcc_details(94407, "Gukesh", 19000);
        sbi.withdraw(2000);
        hdfc.deposit(500);
    }
}
