package projects.FileSort;

import java.io.IOException;
import java.util.Scanner;

public class FileOrganizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directory path: ");
        String dirpath = sc.nextLine();
        System.out.println("Enter organization criteria (extension/date/size): ");
        String criteria = sc.nextLine();
        try {
            FileOrganizerService service = new FileOrganizerService(dirpath);
            service.sortBy(criteria);
        }catch (IOException e){
            System.out.println("Error :"+e.getMessage());
        }

    }
}

