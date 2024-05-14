package program_week9;

import java.util.Arrays;

public class Program3_ReverseAnArray {

    /**
     *
     * Write a Java program to reverse an array of integer values.
     */

    public static void main(String[] args) {
        int[] r = {10, 20, 30, 40, 50, 60};
        System.out.println("Before array" + Arrays.toString(r));
        reverseArray(r, r.length);
       // System.out.println("reverse array" + Arrays.toString(r));
    }

    public static void reverseArray(int a[], int n) {
        //declare the array
        int[] rArray = new int[n];
        int j = n;

        for (int i = 0; i < n; i++) {
            rArray[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("Reverse array");
        for (int k = 0; k < n; k++)
            System.out.print(rArray[k]+" , ");


    }
}
