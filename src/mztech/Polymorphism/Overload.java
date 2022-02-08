package mztech.Polymorphism;

/*
In java, it is possible to define two or more methods of same name in a class, provided that there argument list or parameters are different.
 This concept is known as method overloading.
 */
public class Overload {
    /*
    Here the method demo() is overloaded 3 times: first having 1 int parameter, second one has 2 int parameters
    and third one is having double arg. The methods are invoked or called with the same type and number of parameters used.
     */


    public static void main(String[] args) {
        add(2);
        add(2, 3);
        add(1, 2, 3);
    }

    static void add(int a) {
        System.out.println(a);
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void demo(int a) {
        System.out.println("a : " + a);
    }

    void demo(int a, int b) {
        System.out.println("a and b : " + a + "," + b);
    }

    double demo(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

}
