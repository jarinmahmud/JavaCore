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
    public static void main(String[] args){
        System.out.println("Hello World!");

    }
}
