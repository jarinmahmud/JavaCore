package mztech.classwork;

import java.util.Scanner;

public class HowToTakeInput {
    public static void main(String[] args) {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // String input
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        // Character input
        System.out.println("Enter gender M/F: ");
        char gender = sc.next().charAt(0);// next() function returns the next token/word in the input as a string
        // and charAt(0) function returns the first character in that string.

        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter Contact No. : ");
        long mobileNo = sc.nextLong();
        System.out.println("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        // Print the values to check if input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
    }
}