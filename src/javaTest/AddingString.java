package javaTest;

public class AddingString {

    public static void print() {
        String x = "car";
        String y = "is";
        String z = "blue";
        String a = x.concat(y).concat(z);
        System.out.print(a);
    }

    public static void main(String[] args) {
        print();
    }
}
