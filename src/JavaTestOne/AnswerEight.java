package JavaTestOne;

import java.util.Scanner;

public class AnswerEight {
    /*> QUESTION 8 - Positive or Negative
>

        - Write a Java program to get a number from the user and print whether it is positive or negative.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        double num = sc.nextDouble();

        if (num >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }


    }
}
