package mztech.classwork;

public class Method {

    public static void main (String[] args){
        /*
        A method in Java is a set of instructions that can be called for execution using the method name.
    Syntax
    public static int method(int a, int b){
    //method code
    }
     */
        printFullName("Jarin", 20);
        printFullName("Samuel", 25);

        System.out.println(carName("BMW"));


    }
    public static void printFullName(String name, int age){

        System.out.println("My name is " + name + "." + "Age: " + age);
    }
    //returns value
    public static String carName(String carName){

        return carName;
    }
}
