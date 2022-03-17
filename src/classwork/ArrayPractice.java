package classwork;

public class ArrayPractice {
    public static void main(String[] args) {
        String sentence = "I LOVE JAVA";
        String[] words = sentence.split("I");
        System.out.println(words[1]);

        String[] colors = {"red", "green", "blue"};
        for (String c : colors) {
            System.out.println(c);
        }
        for (int i = 0; i <= colors.length - 1; i++) {
            System.out.println(colors[i]);
        }


    }

}
