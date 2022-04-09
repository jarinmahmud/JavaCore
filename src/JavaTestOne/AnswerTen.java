package JavaTestOne;

import java.util.Scanner;

public class AnswerTen {
    /*
    > QUESTION 10 - Is it a vowel
    >

    - Take a character an input from user and if its a e i o u you have to say it’s a vowel
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("it's a vowel.");
                break;

            default:
                System.out.println("not a vowel.");

        }


    }
}
