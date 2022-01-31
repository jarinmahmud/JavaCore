package mztech.classwork;

public class Loop {
    //A loop statement allows us to execute a statement or group of statements multiple times
    //for loop
    //while loop
    // do...while loop

    public static void main(String[] args) {
//Example of an infinite loop
       /* for( ; ; ){
            System.out.println("Print");

        */

        // For loop
        for (int i = 0; i < 10; i++) {
            // int declares type
            // i = 0 initializes initial value
            // i<10 condition
            // i++ incrementing the steps
            System.out.println(i);

        }
        // Enhance for loop
        /*Syntax
        for (datatype : arrayname ){
        }
         */
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.println(x);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //While loop
        /*
        Syntax
        while (i<10){
        System.out.println (i);
        i++;
        }
        i<10 condition
         */
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        //do...while loop
        /*
        Syntax
        int j =0;
        do{
        j++;
        }
        while(j <= 10);
         */
        int j = 0;
        do {
            System.out.println("*");
            j++;
        }
        while (j <= 10);

        //Break -> print 1 to10 but break the loop after we print up to 5
        for (int m = 1; m < 10; m++) {
            System.out.println(m);
            if (m == 5) {
                break;
            }
        }
        //Continue
        for (int m = 1; m < 10; m++) {

            if (m == 5) {
                continue;// notice 5 didn't printed because continue immidiately jumps to the next iteration
            }
            System.out.println(m);
        }

        //another continue example
        numbers = new int[]{10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                continue; //moves to the next step
            }
            System.out.println(x);
        }

    }
}
