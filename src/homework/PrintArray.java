package homework;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        //print 1-D array
        int[] oneDArray = {1, 2, 3, 4, 5, 6};
        System.out.print(Arrays.toString(oneDArray));
        /* other methods:
        ------- Method 1:------
         System.out.print("1D Array: \n[");
        for (int one : oneDArray) {
            System.out.print(one + " ");

        }
        System.out.println("]\n");
            //prints
           [1 2 3 4 5 6 ]

        ---------- Method 2:-----------
         System.out.print("[");
        for (int i = 0; i <= oneDArray.length - 1; i++) {
            System.out.print(" " + oneDArray[i] + " ");
            int lastIndex = oneDArray.length - 1;
            if (i != lastIndex) {
                System.out.print(",");// if i is not last index then add comma
            }
        }
        System.out.println("]");
        //prints:
        [ 1 , 2 , 3 , 4 , 5 , 6 ]

        */

        //print 2-D array
        int[][] twoDArray = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.out.println(Arrays.deepToString(twoDArray));
        /* Other Methods:
        ----------Method 1:---------
        System.out.print("2D Array: \n[");
        for (int[] two : twoDArray) {
            System.out.print("[" + " ");
            for (int x : two) {
                System.out.print(x + " ");
            }
            System.out.print("]");
        }
        System.out.print("]\n");

        //prints:
        [[ 1 2 ][ 3 4 ][ 5 6 ][ 7 8 ]]

       -----------   Method 2:--------
           System.out.print("[");
        for (int i = 0; i < twoDArray.length; i++) {
            System.out.print("[");

            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j]);
                int lastIndex = twoDArray[i].length - 1;
                if (j != lastIndex) {
                    System.out.print(",");// if j is not last index then add comma
                }
            }
            System.out.print("]");
            if (i != twoDArray.length - 1) {
                System.out.print(",");// if i is not last index then add comma
            }

            System.out.print("");
        }
        System.out.print("]");

        //prints:
        [[1,2],[3,4],[5,6],[7,8]]


         */

        //print 3-D array
        int[][][] threeDArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}, {{9, 10}, {11, 12}}};
        System.out.println(Arrays.deepToString(threeDArray));

        /* other methods:
        ---------------Method 1 :-------------
        System.out.print("3D Array: [");
        for (int[] three : threeDArray){
            System.out.print("[");
            for (int[] y : three{
                System.out.print("[");
                for (int z : three) {
                     System.out.print(one);
                 }
            System.out.print("]");
            }
         System.out.print("]");
            }
         System.out.print("]");
            }

            //prints:
            3D Array: [[[[I@1b6d3586[I@4554617c][[I@1b6d3586[I@4554617c]][[[I@74a14482[I@1540e19d][[I@74a14482[I@1540e19d]][[[I@677327b6[I@14ae5a5][[I@677327b6[I@14ae5a5]]]


       -------------------  Method 2:--------------
          System.out.print("[");
        for (int i = 0; i < threeDArray.length; i++) {
            System.out.print("[");
            for (int j = 0; j < threeDArray[i].length; j++) {
                System.out.print("[");
                for (int k = 0; k < threeDArray[i].length; k++) {
                    System.out.print(threeDArray[i][j][k]);
                    if (k != threeDArray[i].length - 1) {
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                if (j != threeDArray[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (i != threeDArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

        //prints:
        [[[1,2],[3,4]],[[5,6],[7,8]],[[9,10],[11,12]]]

         */
    }
}
