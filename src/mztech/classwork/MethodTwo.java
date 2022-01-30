package mztech.classwork;

public class MethodTwo {
    public static void main(String[] args) {
        /*
             I am a teen or not ?
                => Age validation to check age > 0 && age < 150
                => I have to make sure I am over 13 and less than 18
                => If I am over 18, I am adult

                Is to spit out, if you are a teen (13 - 17), adult(over 18), child (0 - 12) given I am provided with an age

         */


        isTeen();


    }

    // Checks for Age validation to check age > 0 && age < 150
    public static boolean isValidAge(int age){
        if(age < 0){
            return false;
        }
        else if(age > 150){
            return false;
        }
        else return true;
    }

    public static void isTeen(){
        int localAge = 14;
//        int localAge = getAge(15);

        // Check if age is valid and then check if age > 13

        //isValidAge(localAge) && localAge > 13
        // true && false

        if(isValidAge(localAge) && localAge > 13 && localAge < 18){
            System.out.println("You are a teen");
        }
        else {
            System.out.println("You are not a teen");
        }
    }
}