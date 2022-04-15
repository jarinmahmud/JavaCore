package JavaTestOne;


import java.util.Scanner;

public class AnswerSix {
    /*
    > QUESTION 6 Check the current status of the car
>

- Ask the user if the car is ON ‘

- If the user says ON, then output “You are all set to go. Drive carefully”

- If the user says OFF, then output “Please start the car before proceeding”
     */
    public static void main(String[] args) {
        System.out.println("Is the car on?");
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();

        if (ans.equalsIgnoreCase("ON")) {
            System.out.println("You are all set to go. Drive carefully.");
        } else if (ans.equalsIgnoreCase("OFF")) {
            System.out.println("Please start the car before proceeding.");
        } else {
            System.out.println("Invalid answer.");
        }
    }
}
