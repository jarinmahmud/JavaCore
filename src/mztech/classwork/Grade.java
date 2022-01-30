package mztech.classwork;
import java.util.Scanner;
public class Grade {
    /*
    Ask user for an number grade (https://tutorialspoint.dev/language/java/scanner-class-in-java) and then output, if the letter grade they gotten
A -> 90-100
B -> 80-89
C-> 65-79
F -> 0 - 64
Also do this using case statement !!!important
Output should be, You got A - C or You failed
     */
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter obtained marks : ");
    int marks = sc.nextInt();

         switch(marks) {
             int x = marks;
        case 1 :
            if (0<=x<=64){
                System.out.println("Grade: F");
            }
            break;
        case 2 :
            if (65<=marks<=79){
                System.out.println("Grade: C");
            }
            break;

        case 3 :
            if (80<=marks<=89){
                System.out.println("Grade: B");
            }
            break;
        case 4 :
            if (90<=marks<=100){
                System.out.println("Grade: A");
            }
            break;

        case 5 :
            if (0>marks>100){
                System.out.println("Please enter a valid grade.");
            }
            break;

        default :
            System.out.println("Invalid grade.");
    }
      System.out.println("Your grade is " + marks);
}


    }


    /* with if-else statement:

    public static void main(String[] args) {

            Scanner gradeIs = new Scanner(System.in);
            System.out.println("Enter your grade:");

            int grade = gradeIs.nextInt();

            if (grade > 90 && grade <= 100) {
                System.out.println("Your grade is an A");

            } else if (grade > 80 && grade <= 89) {
                System.out.println("Your grade is an B");

            } else if (grade >= 65 && grade <= 79) {
                System.out.println("Your grade is an C ");

            } else if (grade >= 0 && grade <= 64) {
                System.out.println("Your grade is an F");
            }


        }
     */
    /*
    // With switch-break statement:

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter obtained marks : ");
    int marks = sc.nextInt();

         switch(marks) {
         case 1 :
         if (0<=marks<=64){
         System.out.println("Grade: F");
         }
           break;
         case 2 :
         if (65<=marks<=79){
         System.out.println("Grade: C");
         }
           break;

         case 3 :
         if (80<=marks<=89){
         System.out.println("Grade: B");
         }
           break;
         case 4 :
         if (90<=marks<=100){
         System.out.println("Grade: A");
         }
           break;

         case 5 :
         if (0>marks>100){
         System.out.println("Please enter a valid grade.");
         }
         break;

         default :
            System.out.println("Invalid grade.");
      }
      System.out.println("Your grade is " + marks);
   }
     */

