package mztech.classwork;

public class CharStringNumber {
    public static void main (String[] args){
        //Number
        Integer l = 5; // boxes int to an Integer Object
        l = l + 10; // unboxes integer to a int
        System.out.println(l);
        Integer m = 10;
        int ten = 10;

        //Random
        System.out.println("Random" + Math.random());

        //Math class functions
        //round(), min(), max(), exp(), sqrt(), random()


        //equals()
        System.out.println(l.equals(m));// l == m

        //toString ()
        System.out.println(l.toString());// converts int to string
        System.out.println(Integer.toString(12));

        //Integer.parseInt()
        String five = "5";
        System.out.println(Integer.parseInt(five));// converts string to integer

        //concat adds two string
        System.out.println(five.concat(ten + ""));// + "" after int makes it string


        //xxxValue()
        //returns byte primitive data type
        System.out.println(l.longValue());

        //compareTo() 0 for equal, 1 for grater than and -1 for less than
        System.out.println(l.compareTo(3));


        char letter = 'm';
        char letterTwo = 'Z';
        System.out.println("Turn this" + letter + "letter to upper case " + Character.toUpperCase(letter));
        System.out.println("Turn this" + letterTwo + "letter to lower case " + Character.toLowerCase(letterTwo));

        //String
        String name = "Jarin";
        System.out.println("My name is " + name);
        System.out.println("====");

        //Convert Char array to string
        char[] company = { 'M', 'Z', 'T', 'e', 'c', 'h'};
        for (char x : company){
            System.out.print(x);
        }
        System.out.println("");

        //Convert char array to string

    }
}
