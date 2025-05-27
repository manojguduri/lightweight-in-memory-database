package com.Capgemini_Practice;

import java.util.Scanner;

class InvalidRoomTypeException extends Exception {
    InvalidRoomTypeException(String message) {
        super(message);
    }
}

class InvalidCustomerTypeException extends Exception {
    InvalidCustomerTypeException(String message) {
        super(message);
    }
}

interface Booking {
    double calculateCost() throws InvalidCustomerTypeException;
}

class Room {
    protected String roomType;
    protected String customerType;
    protected int days;

    public Room(String roomType, String customerType, int days) {
        this.roomType = roomType;
        this.customerType = customerType;
        this.days = days;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public int getDays() {
        return days;
    }
}

class ClassicRoom extends Room implements Booking {
    private final int basePrice = 1000;

    public ClassicRoom(String roomType, String customerType, int days) {
        super(roomType, customerType, days);
    }

    @Override
    public double calculateCost() throws InvalidCustomerTypeException {
        if (customerType.equalsIgnoreCase("Regular")) {
            return basePrice * days;
        } else if (customerType.equalsIgnoreCase("Premium")) {
            return basePrice * days * 0.90; // 10% discount
        } else {
            throw new InvalidCustomerTypeException("Select either Regular or Premium as Customer type");
        }
    }
}

class LuxuryRoom extends Room implements Booking {
    private final int basePrice = 1500;

    public LuxuryRoom(String roomType, String customerType, int days) {
        super(roomType, customerType, days);
    }

    @Override
    public double calculateCost() throws InvalidCustomerTypeException {
        if (customerType.equalsIgnoreCase("Regular")) {
            return basePrice * days;
        } else if (customerType.equalsIgnoreCase("Premium")) {
            return basePrice * days * 0.88; // 12% discount
        } else {
            throw new InvalidCustomerTypeException("Select either Regular or Premium as Customer type");
        }
    }
}

class SuiteRoom extends Room implements Booking {
    private final int basePrice = 2000;

    public SuiteRoom(String roomType, String customerType, int days) {
        super(roomType, customerType, days);
    }

    @Override
    public double calculateCost() throws InvalidCustomerTypeException {
        if (customerType.equalsIgnoreCase("Regular")) {
            return basePrice * days;
        } else if (customerType.equalsIgnoreCase("Premium")) {
            return basePrice * days * 0.85; // 15% discount
        } else {
            throw new InvalidCustomerTypeException("Select either Regular or Premium as Customer type");
        }
    }
}

public class HotelManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalRevenue = 0;

        while (sc.hasNextLine()) {
            String roomType = sc.nextLine().trim();
            if (roomType.isEmpty()) break; // End input with blank line

            String customerType = sc.nextLine().trim();
            int days = 0;
            try {
                days = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number entered for days.");
                continue;
            }

            try {
                Room room;
                if (roomType.equalsIgnoreCase("Classic")) {
                    room = new ClassicRoom(roomType, customerType, days);
                } else if (roomType.equalsIgnoreCase("Luxury")) {
                    room = new LuxuryRoom(roomType, customerType, days);
                } else if (roomType.equalsIgnoreCase("Suite")) {
                    room = new SuiteRoom(roomType, customerType, days);
                } else {
                    throw new InvalidRoomTypeException("Invalid room type: " + roomType);
                }

                Booking booking = (Booking) room;
                double cost = booking.calculateCost();
                totalRevenue += cost;

                System.out.printf("Total cost for %s room (%s) for %d days: ₹%.2f%n",
                        room.getRoomType(), room.getCustomerType(), room.getDays(), cost);

            } catch (InvalidRoomTypeException | InvalidCustomerTypeException e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
        }

        System.out.printf("Total Revenue : ₹%.2f%n", totalRevenue);
    }
}