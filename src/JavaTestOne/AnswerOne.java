package JavaTestOne;

import java.util.Scanner;

public class AnswerOne {
    /*
    > QUESTION 1 Take two user inputs and output the following :

- Average - Example : 5, 7 and the output is

- The average of 5 and 7 is 6

- Which number is bigger

- 7 is greater than 5
     */
    public static void main(String[] args) {
        //take two inputs
        //make average
        //print avg result
        //check which number is greater
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number:");
        int x = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Second Number:");
        int y = sc2.nextInt();

        int avg = (x + y) / 2;

        System.out.println("The average of " + x + " and " + y + " is " + avg + ".");

        if (x > y) {
            System.out.println(x + " is greater than " + y + ".");
        }

        if (y > x) {
            System.out.println(y + " is greater than " + x + ".");
        }
        if (x == y) {
            System.out.println("The numbers are equal to each other.");
        }


    }

}
