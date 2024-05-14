package calculate;

public class Calculator {

    public void addition(int a, int b) {
       int result = a + b;
        System.out.println("Addition of" + a + "and" + b + " is:" + result);
    }

    public void substraction(int a, int b) {
        int result = a - b;
        System.out.println("Substraction of" + a + "and" + b + " is:" + result);
    }

    public void division(int a, int b) {
        int result = a / b;
        System.out.println("Division of" + a + "and" + b + " is:" + result);

    }

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("multiplication of" + a + "and" + b + " is:" + result);
    }

    public void calculateresults(int a, int b, char symbol) {

       // int result = 0;

        if (symbol == '+') {
            addition(a,b);
        } else if (symbol == '-') {
            substraction(a,b);
        } else if (symbol == '*') {
            multiplication(a,b);
        } else if (symbol == '/') {
            division(a,b);
        } else
            System.out.println("Invalid operator ");

    }
}










