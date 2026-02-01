package OPPS.PlayWithData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

public class SortRecordWithCollection {
    public static void main(String[] args) {
        List<Record> records = new ArrayList<>(
                Arrays.asList(
                        new Record(1, "Vivek", 85),
                        new Record(2, "Anshu", 84),
                        new Record(3, "Pankaj", 82),
                        new Record(4, "Kumar", 75),
                        new Record(5, "Pawan", 82),
                        new Record(6, "Kundan", 75)));
        Collections.sort(records, new Comparator<Record>() {
            @Override
            public int compare(Record r1, Record r2) {

                if (r1.marks != r2.marks) {
                    return r2.marks - r1.marks; // Descending marks
                }
                return r1.name.compareTo(r2.name); // Ascending name
            }
        });

        records.forEach(System.out::println);
    }
}
