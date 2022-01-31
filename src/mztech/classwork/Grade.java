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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter obtained marks (0-100): ");
        int marks = sc.nextInt();
        findGrade(marks);

    }

    public static boolean validateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            return false;
        } else return true;

    }

    public static void gradeA(int marks) {
        if (validateGrade(marks) && marks >= 90 && marks < 100) {
            System.out.println("Grade: A");
        }
    }

    public static void gradeB(int marks) {
        if (validateGrade(marks) && marks >= 80 && marks < 89) {
            System.out.println("Grade: B");
        }
    }

    public static void gradeC(int marks) {
        if (validateGrade(marks) && marks >= 65 && marks < 79) {
            System.out.println("Grade: C");
        }
    }

    public static void gradeF(int marks) {
        if (validateGrade(marks) && marks < 65) {
            System.out.println("Grade: F");
        }

    }

    public static void findGrade(int marks) {
        gradeA(marks);
        gradeB(marks);
        gradeC(marks);
        gradeF(marks);

        if (!validateGrade(marks)) {
            System.out.println("Please enter a valid grade.");
        }
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

    public static String findGrade(int marks) {
        if (marks < 0 || marks > 100)
            return "Invalid score";

        switch (marks / 10) {
            case 10:
            case 9:

                return "A";


            case 8:

                return "B";


            case 7:
            case 6:

                return "C";


            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:

                return "F";


            default:
                return "Invalid Grade.";

        }

    }
     */

