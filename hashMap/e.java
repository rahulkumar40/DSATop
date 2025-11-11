import java.util.*;

public class e {
    public static void main(String[] args) {
        //
        // create a hashMap using java hashMap clas to store the following pairs
        // (person, age) and display them

        // syntex
        Map<String, Integer> map = new HashMap<>();

        // entering value inside the map
        map.put("akash", 25);
        map.put("rahul", 22);
        map.put("vivek", 23);
        map.put("yash", 16);
        map.put("risika", 17);

        // getting value of a key of the hashMap
        System.out.println(map.get("yash")); // 16

        System.out.println(map.get("al")); // null

        // changing / updating for the HashMap
        map.put("yash", 20);
        int k = map.get("akash");
        System.out.println(k);

        // removing a pair from the hashMap
        System.out.println(map.remove("akash")); // 25
        System.out.println(map.remove("shayam")); // null

        // checking if a key exist or not
        System.out.println(map.containsKey("akash")); // false
        System.out.println(map.containsKey("rahul")); // true

        // adding a new entry only if the new key does't exist already
        if (!map.containsKey("yash"))
            map.put("yash", 29);

        map.putIfAbsent("yashika", 30);
        map.putIfAbsent("yash", 29);

        // get all key in the HashMpa
        System.out.println(map.keySet());

        // get all values in the hashmap
        System.out.println(map.values());
        // get all entries in the hashMap
        System.out.println(map.entrySet());

        // travelsal in HashMap - different method

        // with the help of keySet()
        for (String key : map.keySet()) {
            System.out.println("Age of " + key + map.get(key));
        }
        System.out.println();

        // entry itself
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Age of " + e.getKey() + " is " + e.getValue());
        }

        System.out.println( );
        for (var e : map.entrySet()) {
            System.out.println("Age of   " + e.getKey() + "   is    " + e.getValue());
        }
    }
}
