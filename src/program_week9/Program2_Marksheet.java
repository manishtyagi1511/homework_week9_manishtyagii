package program_week9;

import java.util.Scanner;

public class Program2_Marksheet {
    /**
     *
     * 2. Rewrite the student mark sheet programme (From java-homework-week3
     * programmes) using if else and while loop.
     */


    public static void main(String[] args) {
        //declare scanner class to read input from user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scn.next();
        System.out.println("Enter Roll No.: ");
        int rollNum = scn.nextInt();
        int mathsMarks, scienceMarks, englishMarks;
        do {
            System.out.println("Enter Maths Subject Mark between 0 and 100: ");
            mathsMarks = scn.nextInt();
            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.print("Invalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks:  ");
                mathsMarks = scn.nextInt();
            }
        } while (mathsMarks < 0 || mathsMarks > 100);

        do {
            System.out.println("Enter Science Subject Mark between 0 and 100:");
            scienceMarks = scn.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.print("Invalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks: ");
                scienceMarks = scn.nextInt();
            }
        } while (scienceMarks < 0 || scienceMarks > 100);

        do {
            System.out.println("Enter English Subject Mark between 0 and 100:");
            englishMarks = scn.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.print("Invalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks: ");
                englishMarks = scn.nextInt();
            }
        } while (englishMarks < 0 || englishMarks > 100);


        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        scn.close();

    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, int total, double percentage, String result,
                                         String grade) {
        //print marksheet
        System.out.println(" ___________");
        System.out.println("|                               |");
        System.out.println("|              Mark Sheet        |");
        System.out.println("|___________|");
        System.out.println("|        Name        :   " + name + "     |");
        System.out.println("|        Roll No:    " + rollNum + "          |");
        System.out.println("|___________|");
        System.out.println("|        Subjects    :    Marks |");
        System.out.println("|___________|");
        System.out.println("|        Math        :     " + mathsMarks + "    |");
        System.out.println("|        Science:    " + scienceMarks + "          |");
        System.out.println("|        English:    " + englishMarks + "          |");
        System.out.println("|___________|");
        System.out.println("|        Total       :     " + total + " |");
        System.out.println("|___________|");
        System.out.println("|        Percentage  :     " + percentage + "  |");
        System.out.println("|        Result      :     " + result + "  |");
        System.out.println("|        Grade       :     " + grade + "    |");
        System.out.println("|___________|");
    }
}

