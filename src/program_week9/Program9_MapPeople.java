package program_week9;

import java.util.HashMap;
import java.util.Map;

public class Program9_MapPeople {
    /**
     * Create a HashMap object called people that will store String keys and Integer
     * values: And use for each loop to iterate the value from Map.
     */


    public static void mapping() {
        Map<Integer, String> people = new HashMap<>();

        people.put(1, "John");
        people.put(2, "david");
        people.put(3, "Alex");
        people.put(4, "helen");

        for (Map.Entry<Integer, String> peopleName : people.entrySet()) {
            System.out.println(peopleName.getKey() + " " + peopleName.getValue());

        }

    }

    public static void main(String[] args) {
        mapping();
    }

}
