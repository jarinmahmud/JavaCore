package classwork;

public class SquareMultiplication {
    public static void main(String[] args) {
        /*
Get two numbers, return the multiplication of the numbers after square them
   numOne = 2 -> 2 x 2 -> 4
   numTwo = 3 -> 3 x 3 -> 9
   4 * 9  -> 36
*/
        //get numbers
        //square each of them
        //multiply & print
        Square(2, 3);

    }

    public static int Square(int numOne, int numTwo) {
        int squareNumOne = numOne * numOne;
        int squareNumTwo = numTwo * numTwo;
        int result = squareNumOne * squareNumTwo;
        System.out.println(result);
        return result;

    }
}
