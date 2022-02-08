package mztech.Abstraction;


    /*
    Object-oriented programming, abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. In other words, the user will have the information on what the object does instead of how it does it.

    In Java, abstraction is achieved using Abstract classes and interfaces.
     */
    /*
    Syntax

    public abstract class ClassName{
    }

     */

//If there are any abstract method, class has to be abstract class

//If a class is declared abstract, it cannot be instantiated.???


public abstract class Abstract {
    public static String publicAddress = "123 public";
    private static int age = 100;
    private static String privateAddress = "123 private";

    // Regular Method
    // public static void printName(){
    //System.out.println(name);
    public static int getAge() {
        return age;

    }

    //Encapsulation
    public static String getAddress() {
        return privateAddress;
    }

    public static void add() {
        System.out.println(10 + 5);
    }

    // this is an abstract method
    public abstract void printName();

    public abstract void printAddress();
}


