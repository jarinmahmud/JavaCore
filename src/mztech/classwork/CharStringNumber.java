package mztech.classwork;

public class CharStringNumber {
    public static void main (String[] args){
        //Number
        Integer l = 5; // boxes int to an Integer Object
        l = l + 10; // unboxes integer to a int
        System.out.println(l);

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
