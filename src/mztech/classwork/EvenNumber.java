package mztech.classwork;

public class EvenNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Odd number");
            }
        }
    }
}
