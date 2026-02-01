package OPPS.PlayWithData;

import java.util.*;

class Record {
    int id;
    String name;
    int marks;

    public Record(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return String.format("Id : %d | Name : %-7s | Marks : %d", id, name, marks);
    }
}

public class SortRecord {
    public static void main(String[] args) {
        List<Record> records = new ArrayList<>(
                Arrays.asList(
                        new Record(1, "Vivek", 85),
                        new Record(2, "Anshu", 84),
                        new Record(3, "Pankaj", 82),
                        new Record(4, "Kumar", 75),
                        new Record(5, "Pawan", 82),
                        new Record(6, "Kundan", 75)));
        records.sort(
                Comparator.comparingInt((Record r) -> r.marks).reversed().thenComparing(r -> r.name));
        records.forEach(System.out::println);
    }

    

}
