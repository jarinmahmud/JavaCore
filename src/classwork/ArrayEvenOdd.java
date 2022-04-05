package classwork;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        //take array
        int[] arr = {10, 45, 36, 78, 11, 23};
        //check if numbers are odd and print.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even Number: " + arr[i]);
            } else {
                System.out.println("Odd Number: " + arr[i]);
            }
        }


    }
}
