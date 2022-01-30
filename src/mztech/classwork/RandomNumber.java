package mztech.classwork;

public class RandomNumber {

    public static void main (String[] args){
        int min = 1;
        int max = 6;

        //generate random int value from 1 to 6
        System.out.println("Random value from " +min+ " to " + max + ":");
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(randomInt);




        //Math.random()*(max-min) -> does the job
        // +min sets the min value t0 the range
        /*  Math.floor and +1 : Math.random() by our new max range of 10 can only give us a result as high as about 9.999999999999
        because Math.random() only goes as high as about 0.99999999999 (never actually 1).
        When we Math.floor() that later to make it an integer, it brings the result down to 9,
         so we need to add 1 there to make the maximum possible value 10 instead of 9.
         That's what the + 1 part of the formula does.
         */

        //Math.random() returns a floating point number in the range [0, 1), i.e. 0 is a possible outcome, but 1 isn't.
        //
        //(myMax - myMin + 1) is an integer that represents the number of possible distinct integers you can get as final result.
        //
        //Math.floor(Math.random() * (myMax - myMin + 1) is therefore a floating point in the range [0, myMax - myMin + 1)
        //
        //By adding myMin to that, you get a floating point in the range [myMin, myMax + 1)
        //
        //Finally, by applying Math.floor(), the possible values are restricted to integers in the range [myMin, myMax + 1), which for integers is equivalent to {myMin...myMax}.
    }
}

//Math class functions
//round(): is a built-in math function which returns the closest long to the argument.
// min() : is an inbuilt function in java that returns the minimum of two numbers.
// max() : is an inbuilt function in Java which returns maximum of two numbers.
// exp() : This method returns the base of the natural logarithms, e, to the power of the argument.
// sqrt() : sqrt() returns the square root of a value of type double passed to it as argument
//  random() : random() method returns a pseudorandom double type number greater than or equal to 0.0 and less than 1.0.