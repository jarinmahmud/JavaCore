package JavaTestOne;

import java.util.Scanner;

public class AnswerFour {
    /*  > QUESTION 4 Weight Conversion
 >

         - Input weight from user

 - Example 65.7

             - Ask the user if the Weight in Kg and lb

 - Convert the weight and output the result

 - Math formula:

             - Kg to lb: weight * 2.21

             - lb to Kg: weight / 2.21

             - output Example 65.7 KG => “Your converted weight of 65.7Kg is 144.8437lb”

     */
    public static void main(String[] args) {
        //take input for weight
        //ask kg or lb
        //convert and print

        Scanner scWeight = new Scanner(System.in);
        System.out.println("Please enter weight: ");
        int weight = scWeight.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Weight unit:");
        System.out.println("1. kg");
        System.out.println("2. lb");
        int option = sc.nextInt();

        if (option == 1) {
            double conWeightLb = weight * 2.21;
            System.out.println("Output: " + conWeightLb + " lb.");
        }
        if (option == 2) {
            double conWeightKg = weight / 2.21;
            System.out.println("Output: " + conWeightKg + " kg.");
        }


    }
}
