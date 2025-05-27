package projects.InMemoryDatabase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataBase db = new DataBase();

        while(true){
            System.out.println("\n1. Create Table");
            System.out.println("2. Insert Record");
            System.out.println("3. View Records");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> db.createTable(sc);
                case 2 -> db.insertRecords(sc);
                case 3 -> db.viewRecords(sc);
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}

