package mztech.classwork;

public class Operators {
    public static void main (String args[]){
        //operator functionalities: https://www.tutorialspoint.com/java/java_basic_operators.htm

        int x = 21, y = 5;

        //Arithmetic Operators
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        //Increase or decrease by 1
        System.out.println(x++); //22
        System.out.println(x--); //21


        //Relational Operators - Returns true or false
        System.out.println(x==y); //false
        System.out.println(x!=y); //true
        System.out.println(x<y); //false
        System.out.println(x>y); //true
        System.out.println(x<=y); //false
        System.out.println(x>=y); //true

        System.out.println("Is 5+5 = 10 ? : " + !(5+5 == 19)); // !(false) => true

        //Logical Operators
        //Bitwise Operators

        //Assignment Operators
        int a = 5, b = 7, c = 10;
        System.out.println(c += a); // is equivalent to c = c + a
        // c -=a is equivalent to c = c - a


        //Misc/Miscellanous Operators
        //Syntax... condition? value of condition match : value if condition unmatched
        b = (a == 5) ? 20 :30;

        String carColor = "red";
        String bmw = "bmw";
        String audi = "audi";

        System.out.println( "The car is " + ((carColor == "red") ? bmw: audi));

         //instanceof Operator- This operator is used only for object reference variables.
        String name = "James";

        //following will return true since name is type of string
        boolean result = name instanceof String;
        System.out.println("Is name a string? " + result);

    }

}
