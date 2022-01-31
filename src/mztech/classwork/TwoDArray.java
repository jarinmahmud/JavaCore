package mztech.classwork;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};// declaring array
        //printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                int lastIndex = arr[i].length - 1;
                if (j != lastIndex) {
                    System.out.print(",");// if j is not last index then add comma
                }
            }
            System.out.print("]");
            if (i != arr.length - 1) {
                System.out.print(",");// if i is not last index then add comma
            }

            System.out.println();
        }

    }
}
