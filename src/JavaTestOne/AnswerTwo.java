package JavaTestOne;

public class AnswerTwo {
    /*> QUESTION 2 Given User inputs a String - “WORLD”

            - Reverse string without using any inbuilt methods

- Output: “DLROW”

     */
    public static void main(String[] args) {
        System.out.println("Output: " + reverse("WORLD"));


    }

    public static String reverse(String str) {
        String output = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }

        return output;
    }
}
