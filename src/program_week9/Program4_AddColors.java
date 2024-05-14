package program_week9;

import java.util.ArrayList;

public class Program4_AddColors {

    /**
     * Write a Java program to create a new array list, add some colours (string) and
     * printout the collection using for each loop
     */

    public static void addCol() {

        ArrayList<String> obj = new ArrayList<>();

        obj.add("Red");
        obj.add("Yellow");
        obj.add("pink");
        obj.add("blue");


        for (String color : obj)
            System.out.println(color);
    }

    public static void main(String[] args) {
        addCol();

    }
}
