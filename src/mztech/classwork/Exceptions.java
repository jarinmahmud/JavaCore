package mztech.classwork;

public class Exceptions {
    //An exception (or exceptional event) is a problem that arises during the execution of a program.

    public static void main(String[] args) {
/*
try{
//protected block
}catch{
//catch block
}
 */
        try {
            int a[] = new int[2];
            System.out.println("Print array index 3" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Got the following exception: " + e);
        } finally {
            // The finally block always executes
            System.out.println("Finally blocks always excecutes even there is any exception");
        }
        System.out.println("No exception. Continue...");
    }
}
