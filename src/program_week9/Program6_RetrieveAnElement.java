package program_week9;

import java.util.ArrayList;

public class Program6_RetrieveAnElement {

    /**
     * Write a Java program to retrieve an element (at a specified index) from a given
     * array list
     */

    public static void retrieve(){

        ArrayList<String> colorList = new ArrayList<>();

        colorList.add("Red");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Black");
        colorList.add("White");

        System.out.println(colorList);

//        System.out.println("Pick number 1 and 3 ");
//        System.out.println(colorList.get(0));
//        System.out.println(colorList.get(2));

        String element= colorList.get(0);
        System.out.println("First element :" +element);
        element=colorList.get(2);
        System.out.println("Second Element :" + element);


    }

    public static void main(String[] args) {
        retrieve();
    }

}
