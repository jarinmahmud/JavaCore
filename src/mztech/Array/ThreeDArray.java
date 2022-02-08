package mztech.Array;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] arr = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}},
                {{9, 10}, {11, 12}}
        };//declaring 3D array

        System.out.println("["); //first { sign

//printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["); // { sign of each i index value
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[");// { sign of each j index value
                for (int k = 0; k < arr[i].length; k++) {
                    System.out.print(arr[i][j][k]); // printing array
                    if (k != arr[i].length - 1) {
                        System.out.print(",");// , between two k values
                    }
                }

                System.out.print("]"); // } for each j values
                if (j != arr[j].length - 1) {
                    System.out.print(","); // , between j values
                }
            }
            System.out.print("]");
            if (i != arr.length - 1) {
                System.out.print(","); // , between i values
            }
            System.out.println();
        }

        System.out.print("]"); // } for closing
    }
}

