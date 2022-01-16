package mztech.classwork;

public class BasicDataTypes {
    //There are eight primitive data types
    boolean oneIsANumber = true; //boolean is either true or false
    byte x = 2; // 8 bits
    short y = 4; // 16 bits
    long z = 89; // 64 bits
    int u = 15; // integer, 32 bits
    float v = 1.50f; // can hold  decimal, single precision, 32 bits
    double w = 56.40d;// can hold decimal, double precision, 64 bit
    char s = 'h';// single letter

    //String: another data type, basically can hold text, simply an array of characters.

    /* float vs decimal : Float stores an approximate value and decimal stores an exact value.
    In summary, exact values like money should use decimal, and approximate values like scientific measurements should use float.
    When multiplying a non integer and dividing by that same number, decimals lose precision while floats do not.
    */

    /*Reference Data Types: Reference variables are created using defined constructors of the classes.
    They are used to access objects. These variables are declared to be of a specific type that cannot be changed.
    For example, Employee, Puppy, etc.
     */

    /* Access Control Modifiers

    Java provides a number of access modifiers to set access levels for classes, variables, methods and constructors. The four access levels are −

    Visible to the package, the default. No modifiers are needed.
    Visible to the class only (private).
    Visible to the world (public).
    Visible to the package and all subclasses (protected).

     */

    /*
    Java provides a number of non-access modifiers to achieve many other functionality.

The static modifier for creating class methods and variables.

The final modifier for finalizing the implementations of classes, methods, and variables.

The abstract modifier for creating abstract classes and methods.

The synchronized and volatile modifiers, which are used for threads.
     */

    /*
    Naming Convention:
    variables: camelCase
    class: PascalCase
     */

    /*
    Defining variables:
    int j,k,l;
    int x=7, y =10;
     */


}

/*Using Access Modifiers:
public class Employee {

   // this instance variable is visible for any child class.
   public String name;

   // salary  variable is visible in Employee class only.
   private double salary;

   // The name variable is assigned in the constructor.
   public Employee (String empName) {
      name = empName;
   }

   // The salary variable is assigned a value.
   public void setSalary(double empSal) {
      salary = empSal;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

 */

// final , finally, finalize
//Enable auto format on save