package homework;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]) {
        //taking marks as user input
        Scanner input = new Scanner(System.in);
        System.out.print("Input marks: ");
        int marks = input.nextInt();

        System.out.print("Grade: ");

        //conditions for printing grade
        if (marks >= 94) {
            System.out.println("A++");
        } else if (marks >= 81 && marks < 93) {
            System.out.println("A");
        } else if (marks >= 71 && marks < 80) {
            System.out.println("B");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
