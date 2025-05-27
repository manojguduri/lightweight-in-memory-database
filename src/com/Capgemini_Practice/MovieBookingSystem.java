package com.Capgemini_Practice;

import java.util.Scanner;

class SeatNotAvailableException extends Exception{
    SeatNotAvailableException(String message){
        super(message);
    }
}

class InvalidBookingAmountException extends RuntimeException{
    InvalidBookingAmountException(String message){
        super(message);
    }
}

class MovieTheater{
    int totalSeats;
    public MovieTheater(int totalSeats){
        this.totalSeats = totalSeats;
    }

    public void bookSeats(int count) throws SeatNotAvailableException{
        if(count > totalSeats){
            throw new SeatNotAvailableException("Error: Only "+totalSeats+" seats are available. Cannot book "+count+" seats.");
        } else if (count <= 0) {
            throw new InvalidBookingAmountException("Error: Invalid booking amount. Cannot book negative or zero seats.");
        }else{
            totalSeats -= count;
            System.out.println("Successfully booked "+count+" seats.");
            System.out.println("Seats remaining: "+getAvailableSeats());
        }
    }

    public int getAvailableSeats() {
        return totalSeats;
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTheater mv = new MovieTheater(50);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            int count = 0;
            for (int i = 0; i<line.length(); i++){
                if((int)line.charAt(i) < 58 && (int)line.charAt(i)>47){
                    count = (count*10)+((int)line.charAt(i)-48);
                }
            }
            try{
                mv.bookSeats(count);
            }catch (InvalidBookingAmountException | SeatNotAvailableException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
