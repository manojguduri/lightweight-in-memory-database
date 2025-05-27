package com.Capgemini_Practice;
import java.util.Scanner;

interface Rentable{
    void rent(int days);
}

abstract class Vehicle implements Rentable{
    String registrationNumber;
    String model;
    float rentalRatePerDay;

    public Vehicle(String registrationNumber, String model, float rentalRatePerDay){
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }
    public abstract float calculateRental();
    public void displayDetails(){
        System.out.println("Vehicle Type: "+this.getClass().getSimpleName());
        System.out.println("Vehicle Model: "+this.model);
        System.out.println("Vehicle Registration Number : "+this.registrationNumber);
        System.out.println("Rental rate per day : "+this.rentalRatePerDay);
        System.out.println("Total rental cost : "+calculateRental());
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public float getRentalRatePerDay() {
        return rentalRatePerDay;
    }
}

class Bike extends Vehicle implements Rentable{
    int days;
    public Bike(String registrationNumber, String model, int days){
        super(registrationNumber, model, 50);
        this.days = days;
    }

    @Override
    public void rent(int days){
        System.out.println("Bike rented for "+days+" days.");
    }

    @Override
    public float calculateRental(){
        float base = rentalRatePerDay*((float)days);
        return (float) (base + (base*(0.1)));
    }

    public int getDays() {
        return days;
    }
}

class Car extends Vehicle implements Rentable{
    int days;
    public Car(String registrationNumber, String model, int days){
        super(registrationNumber, model, 100);
        this.days = days;
    }

    @Override
    public void rent(int days){
        System.out.println("Car rented for "+days+" days.");
    }

    @Override
    public float calculateRental(){
        float base = rentalRatePerDay*((float)days);
        return base;
    }

    public int getDays() {
        return days;
    }
}

class Truck extends Vehicle implements Rentable{
    int days;
    public Truck(String registrationNumber, String model, int days){
        super(registrationNumber, model, 150);
        this.days = days;
    }

    @Override
    public void rent(int days){
        System.out.println("Truck rented for "+days+" days.");
    }

    @Override
    public float calculateRental(){
        float base = rentalRatePerDay*((float)days);
        return (base + 500);
    }

    public int getDays() {
        return days;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vehicle Type (Bike/Car/Truck) : ");
        String type = sc.nextLine();
        System.out.println("Enter vehicle model : ");
        String model = sc.nextLine();
        System.out.println("Enter vehicle registration number : ");
        String regNum = sc.nextLine();
        System.out.println("Enter number of rental days : ");
        int days = sc.nextInt();

        Vehicle vehicle = null;
        if(type.equalsIgnoreCase("Bike")){
            vehicle = new Bike(regNum, model, days);
        } else if (type.equalsIgnoreCase("Car")) {
            vehicle = new Car(regNum, model, days);
        } else if (type.equalsIgnoreCase("Truck")) {
            vehicle = new Truck(regNum, model, days);
        }else System.out.println("Error!! Try again by entering a valid vehicle type");

        vehicle.rent(days);
        vehicle.displayDetails();
    }
}
