package JavaTestOne;

public class AnswerSeven {
    /*
    > QUESTION 7 - Multiple of
>

- Given number array {13, 3, 8, 9, 6, 15} find the multiple of n = 3
     */
    public static void main(String[] args) {
        int[] num = {13, 3, 8, 9, 6, 15};
        int n = 3;
        System.out.println("The multiples of 3 are:");
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] % 3 == 0) {
                System.out.println(num[i]);
            }
        }

    }
}
