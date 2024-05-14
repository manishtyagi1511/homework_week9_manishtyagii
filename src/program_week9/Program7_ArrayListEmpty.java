package program_week9;

import java.util.ArrayList;

public class Program7_ArrayListEmpty {

    /**
     *
     * Write a Java program to test if an array list is empty or not.
     */

    public static void main(String[] args) {
        // creating an empty integar Arraylist
        ArrayList<Integer> obj = new ArrayList<Integer>();
        boolean ans = obj.isEmpty();
        if (ans == true)
            System.out.println("The Arraylist is empty");
        else
            System.out.println("The Arraylist is not empty");

        //adding object in Arraylist to check if Arraylist is empty
        obj.add(20);
        if (ans = true)
            System.out.println("The array list is empty");
        else
            System.out.println("The array list is not empty");

    }
}
