package JavaTestOne;

import java.sql.SQLOutput;

public class AnswerFive {
    /*
    QUESTION 5 Given the following 2d array, output Name, age and address
    String[][] students = { { “Jon Doe”, “21”, "123 address" }, { “Barak Obama”, "22", "567 address" } }

Output:
   Name : Jon Doe
   Age: 21
   Address: 23 address

   Name : Barak Obama
   Age: 22
   Address: 567 address
     */
    public static void main(String[] args) {
        String[][] students = {{"Jon Doe", "21", "123 address"}, {"Barak Obama", "22", "567 address"}};
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; i < students[i].length; i++) {
                System.out.println("Name: " + students[i][j]);
                //System.out.println("Age: " + students[i][j]);
                //System.out.println("Age: " + students[0][1]);
                //System.out.println("Address: " + students[0][2]);
            }
        }
    }
}
