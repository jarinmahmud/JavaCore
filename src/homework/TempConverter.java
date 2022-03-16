package homework;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // Input temperature
        // Option to choose F/C to convert
        // Convert temperature


        System.out.println("Input temperature to convert: ");
        double temp = input().nextDouble();

        System.out.println("What is the unit of temperature (F/C)?");
        char choice = input().next().charAt(0);

        //convert
        double result;
        // toLowerCase() handling the Uppercase/Lowercase thing.
        if (toUpperCase(choice) == 'F') {
            result = ((temp - 32) * 5) / 9;
            System.out.println("Result : " + result + "F");
        } else if (toUpperCase(choice) == 'C') {
            result = (temp * (9 / 5)) + 32;
            System.out.println("Result : " + result + "C");
        } else {
            System.out.println("Invalid unit.");
        }

    }

    public static char toUpperCase(char choice) {
        return Character.toUpperCase(choice);
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }
}

