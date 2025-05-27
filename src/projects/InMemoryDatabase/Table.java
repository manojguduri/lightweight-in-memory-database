package projects.InMemoryDatabase;

import java.util.*;

public class Table {
    private final String name;
    private final List<String> columns;
    private final List<Record> records;


    public Table(String name, List<String> columns) {
        this.name = name;
        this.columns = columns;
        this.records = new ArrayList<>();
    }

    public List<String> getColumns() {
        return columns;
    }

    public void insertRecords(Record record){
        records.add(record);
    }

    public void displayRecords() {
        if(records.isEmpty()){
            System.out.println("The table is empty");
            return;
        }
        System.out.println(String.join("|",columns));
        for (Record record : records){
            List<String> rows = new ArrayList<>();
            for (String column : columns){
                rows.add(record.getValue(column));
            }
            System.out.println(String.join("|",rows));
        }
    }
}
