/*
Ques : 
    Create a HashMap using Java HashMap class to stroe the following pairs(Person, AGe) and display them 
Input : 
    Akash 21
    Yash 16
    Lav 17 
    Rishika 19
    Harry 18
Output: 
    Age of Akash is 21
    Age of Yash is 16
    Age of Lav is 17
    Age of Rishika is 19
    Age of Harry is 18
 */

import java.util.HashMap;
import java.util.Map;

public class ClassNameAge {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);

        // teacher effort
        // getting value of a key from the hashMap
        System.out.println(map.get("Rishika")); // 19
        System.out.println(map.get("Riya")); // null

        // changing / pudating value of a key in the hashMap
        map.put("Rishika", 24);
        System.out.println(map.get("Rishika"));// 24

        // Removing a pair from the HashMap
        System.out.println(map.remove("Akash")); // 21
        System.out.println(map.remove("Riay")); // null

        // checking if a key is in the hashMap
        System.out.println(map.containsKey("Rishika")); // true
        System.out.println(map.containsKey("Riga")); // false;

        // Adding a new entry only if the new key doesn't exist already
        if (!map.containsKey("Riya")) {
            map.put("Riya", 24);
        }

        // org

        map.putIfAbsent("name", 5);
        // get all key in the hashMap
        System.out.println(map.keySet());

        // get all values in the hashMap
        System.out.println(map.values());

        // get all entire in the hashMap
        System.out.println(map.entrySet());

        System.out.println(map);

        // Traversing all entries of HashMap - Multiple methods
        for (String key : map.keySet()) {
            System.out.println("Age of " + key + " is " + map.get(key));
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Age of " + e.getKey() + " is " + e.getValue());
        }
        for (var e : map.entrySet()) {
            System.out.println("Age of " + e.getKey() + " is " + e.getValue());

        }

    }
}