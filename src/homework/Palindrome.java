package homework;

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
            System.out.println("Please enter the number: ");
            int numInput = sc.nextInt();
//                 store the number to originalNum
            int originalNum = numInput; // *** You have to keep a copy of the original to compare for later
            int reversedNum = 0, remainder;
            while (numInput != 0) {
                remainder = numInput % 10;
                reversedNum = reversedNum * 10 + remainder;
                numInput = numInput / 10; // *** As numInput is being changed here
            }
            // *** Compare with originalNum copy not the modified numInput
            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is palindrome.");
            } else {
                System.out.println(originalNum + " is not palindrome.");
            }
        } else if (option == 2) {
            System.out.println("Please enter the string: ");
            String stringInput = sc.next();
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