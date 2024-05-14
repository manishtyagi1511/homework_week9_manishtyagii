package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        Calculator obj1= new Calculator();


       char choice='Y';
       while (choice=='y' || choice=='Y') {
           System.out.println("Enter first Number:");
           int number1 = obj.nextInt();
           System.out.println("Enter second Number");
           int number2 = obj.nextInt();
           System.out.println("Please enter one of symbol +,-,*, /:”");
           char symbol = obj.next().charAt(0);


           obj1.calculateresults(number1, number2, symbol);


           System.out.println("Would you like to do more calculation Please enter “Y” or “N” :”");
           choice = obj.next().charAt(0);

       }
        System.out.println("Program Terminated");

       }










      //  System.out.println("");
    }

