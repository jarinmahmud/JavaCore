package javaTest;

public class Occurance {
    // given there is an array of numbers. how many times the numbers a certain number appear?
    // {1,9,7,8,6,9,5,9}

    static int arr[] = {1, 9, 7, 8, 6, 9, 5, 9};

    public static int occur(int numberToOccur) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == numberToOccur) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("repeated number : " + occur(9));
    }
// given there is 3 variables. car, is, blue;


}
