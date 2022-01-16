package mztech.classwork;

public class Main{
    /*public: public is an access specifier which can be used outside the class.
    When main method is declared public it means it can be used outside class.

   static: to call a method we require object. Sometimes it required to call a method without the help of object.
   Then we declare the method as static.JVM calls the main() method without creating object by declaring keyword static.

   void: void return type is used when a method does not return any value. main method does not return any value, so main() is declared as void.

   String[] args: Java main method accepts a single type of argument, string array. This is also called as java command line arguments.

   System.out.println(""): keyword to print anything
     */
    //camelCase
    //PascalCase
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println(10 -1);
        System.out.println(4 * 6);
        System.out.print("Hello");
        System.out.print("World");

        //System: It is a final class defined in the java.lang package.
        //out: This is an instance of PrintStream type, which is a public and static member field of the System class.
        /*
        println(): As all instances of PrintStream class have a public method println(), hence we can invoke the same on out as well.
         This is an upgraded version of print().
        It prints any argument passed to it and adds a new line to the output.

         */

    }
}
