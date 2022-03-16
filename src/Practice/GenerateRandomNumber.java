package Practice;

import java.util.Scanner;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        //int numOne,numTwo;
        System.out.println("Enter starting number: ");
        int x = takeInput().nextInt();
        System.out.println("Enter ending number: ");
        int y = takeInput().nextInt();

        int result = x + (int) Math.floor(Math.random() * ((y - x) + 1));
        System.out.println("The random number is " + result + ".");
    }

    private static Scanner takeInput() {
        return new Scanner(System.in);

    }
}


