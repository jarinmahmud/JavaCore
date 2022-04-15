package JavaTestOne;

public class AnswerThree {
    /*
    > QUESTION 3 Given a use provides a sentence “I love Java”

            >

            - Output how many words are in the sentence

- HINT: you will have to use split method and split by userString.split(" ");

     */
    public static void main(String[] args) {
        String str = "I Love Java";
        String[] x = str.split(" ");
        System.out.println(" There are " + x.length + " words in given input.");

    }

}
