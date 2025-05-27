package projects.InMemoryDatabase;

import java.util.*;

public class Record {
    private final Map<String, String> values;

    public Record(Map<String, String> value) {
        this.values = value;
    }

    public String getValue(String column) {
        return values.getOrDefault(column, "NULL");
    }
}
