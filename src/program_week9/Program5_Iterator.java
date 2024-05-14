package program_week9;

import java.util.ArrayList;
import java.util.Iterator;

public class Program5_Iterator {
    /**
     * Write a Java program to iterate through all elements in an array list using
     * Iterater
     */

    public static void interator1(){

        ArrayList<Integer> number = new ArrayList<>();

        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        Iterator<Integer> numIt= number.iterator();
        System.out.println("Element in the Arraylist");
        while (numIt.hasNext()){
            System.out.println(numIt.next());

        }
    }

    public static void main(String[] args) {
        interator1();
    }

}