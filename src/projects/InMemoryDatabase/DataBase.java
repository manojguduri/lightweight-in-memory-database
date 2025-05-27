package projects.InMemoryDatabase;

import java.util.*;

public class DataBase {
    private final Map<String, Table> tables = new HashMap<>();

    public void createTable(Scanner sc){
        System.out.println("Enter table name :");
        String name = sc.nextLine().toLowerCase();
        if(tables.containsKey(name)){
            System.out.println("Table already exists");
            return;
        }
        System.out.println("Enter columns(comma separated) :");
        String[] cols = sc.nextLine().split(",");
        List<String> columnList = new ArrayList<>();
        for (String col : cols){
            columnList.add(col.toLowerCase());
        }
        tables.put(name, new Table(name, columnList));
        System.out.println("Table is created");
    }

    public void insertRecords(Scanner sc){
        System.out.println("Enter the table name: ");
        String name = sc.nextLine().toLowerCase();
        if(!tables.containsKey(name)){
            System.out.println("Table does not exist");
            return;
        }
        Table table = tables.get(name);
        Map<String, String> values = new HashMap<>();
        for (String col : table.getColumns()) {
            System.out.print("Enter value for '" + col + "': ");
            values.put(col, sc.nextLine());
        }
        table.insertRecords(new Record(values));
        System.out.println("Records successfully inserted");
    }

    public void viewRecords(Scanner sc){
        System.out.println("Enter the table name : ");
        String name = sc.nextLine().toLowerCase();
        if(!tables.containsKey(name)){
            System.out.println("Table does not exist");
            return;
        }
        Table table = tables.get(name);
        table.displayRecords();
    }
}
