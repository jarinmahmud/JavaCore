package homework;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // Option to choose F/C to convert
        // Input temperature
        // convert temperature

        Scanner optInput = new Scanner(System.in);
        System.out.println("Choose Option from the list: ");
        System.out.println("1. Convert F to C ");
        System.out.println("2. Convert C to F");
        System.out.println("Input choice: ");
        int choice = optInput.nextInt();

        Scanner tempInput = new Scanner(System.in);
        System.out.println("Input temperature to convert: ");
        int temp = tempInput.nextInt();

        int result;

        if (choice == 1 || choice == 2) {

            if (choice == 1) {
                result = ((temp - 32) * 5) / 9;
                System.out.println("Result : " + result + "C");
            }
            if (choice == 2) {
                result = (temp * (9 / 5)) + 32;
                System.out.println("Result : " + result + "F");
            }
        } else {
            System.out.println("Invalid Choice.");
        }

    }
}
