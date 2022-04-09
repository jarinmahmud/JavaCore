package JavaTestOne;

public class AnswerNine {
    /*
    > QUESTION 9 - Total sum of array

>

        - Use for loop to add the following number from array [1,3,5,9,8]

            - output Sum : 54

     */
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 9, 8};
        int sum = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum: " + sum);//given example is wrong, output would be 26 for given array.
    }

}
