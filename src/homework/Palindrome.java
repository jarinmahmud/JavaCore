package homework;

import java.util.Scanner;

public class Palindrome {
    //make a method
    //ask if the palindrome is a number or word
    //ask input
    //check if palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from the options:\n 1. The palindrome is a number.\n 2. The palindrome is a word. ");
        int option = sc.nextInt();

        //take the input
        //convert to string
        Scanner num = new Scanner(System.in);
        System.out.println("Input: ");
        int number = num.nextInt();
        String.valueOf(number);

        Scanner word = new Scanner(System.in);
        System.out.println("Input: ");
        String isPalindrome = word.next();


    }


    //check if every character is equal
    //check if equal
    //print result

    public static void isPalindrome() {


    }


}
