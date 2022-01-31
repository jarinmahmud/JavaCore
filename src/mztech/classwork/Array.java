package mztech.classwork;

public class Array {
    /*
    Array - Collection of similar types of data

    variableType[] nameOfArray = {data of index 0, data of index 1,....., data of index n}
    int[] numbers = {1,2,3,4,5}
    // index of arr  0 1 2 3 4 // Max index is 4 but length is 5 because length starts from 1

    index = postion number, starts from 0
    [] // means array 1Dimension
    [][] // 2D array
    [][][] // 3D array
     */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Length of number [] is " + numbers.length); // length is a property of array
        //Printing array values
        System.out.println(numbers[2]); // nameOfTheArray[indexvalue]

        String[] names = {"Jarin", "Atika", "Minhaz", "Abdur", "Tanveer"};
        System.out.println("Student 3's name is " + names[2]);

        //Printing all values of array using enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        //For loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);// names[0],names[1],.....
        }


    }

}
