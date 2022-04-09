package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    //make a method
    //ask if the palindrome is a number or word
    //ask input
    //check if palindrome
    public static void main(String[] args) {

        isPalindrome();
    }

    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from the following:");
        System.out.println("1. My input is a number.");
        System.out.println("2. My input is a string.");
        int option = sc.nextInt();

        if (option == 1) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            int numInput = sc2.nextInt();

            int reversedNum = 0;
            while (numInput > 0) {
                int remainder = numInput % 10;
                reversedNum = (reversedNum * 10) + remainder;
                numInput = numInput / 10;
            }
            //-------------------------//
            if (numInput == reversedNum) {
                System.out.println(numInput + " is palindrome.");
            } else {
                System.out.println(numInput + " is not palindrome.");
            }

        }
        if (option == 2) {
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Please enter the string: ");
            String stringInput = sc3.next();

            String reverseStr = "";
            for (int i = stringInput.length() - 1; i >= 0; i--) {

                reverseStr = reverseStr + stringInput.charAt(i);
            }

            if (stringInput.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(stringInput + " is a palindrome string.");
            } else {
                System.out.println(stringInput + " is not a palindrome string.");
            }

        } else {
            System.out.println("Invalid input.");
        }

    }
}