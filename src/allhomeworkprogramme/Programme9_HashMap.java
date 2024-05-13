package allhomeworkprogramme;

import java.util.HashMap;
import java.util.Map;
/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme9_HashMap {
    //create main method
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<String, Integer>();
        people.put("Jani", 24);
        people.put("Bhavesh", 25);
        people.put("Ram", 29);
        people.put("Shyam", 21);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " & " + " value: " + people.get(i));
        }
    }
}
