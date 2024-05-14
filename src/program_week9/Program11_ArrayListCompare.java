package program_week9;

import java.util.ArrayList;

public class Program11_ArrayListCompare {

    /**
     *Declare following two arrylist and compare it.
     * ArrayList<String> c1= new ArrayList<String>();
     * c1.add("Red");
     * c1.add("Green");
     * c1.add("Black");
     * c1.add("White");
     * c1.add("Pink");
     * ArrayList<String> c2= new ArrayList<String>();
     * c2.add("Red");
     * c2.add("Green");
     * c2.add("Black");
     * c2.add("Pink");
     *
     */


    public static void main(String[] args) {

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");


        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        if (c1.equals(c2)){
            System.out.println("The ArrayList c1 and c2 are equals");

        }else {
            System.out.println("The ArrayList c1 and c2 are not equals");
        }


    }
}
