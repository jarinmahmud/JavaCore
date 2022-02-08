package mztech.Inheritance;

import mztech.Inheritance.Grandparents;

public class Parent extends Grandparents {
    //public static void main(String[] args) {

    //Using Object
    //Grandparents gp = new Grandparents();
    //System.out.println(gp.firstName);


    static int dadAge = 50;
    static int momAge = 40;
    String lastName = "Begum";

    public static void printDadName() {
        String dadName = "Md";
        System.out.println("My dad's name is " + dadName);
    }

    public static void main(String[] args) {
        System.out.println("This is parent class.");
        System.out.println("Dad's Age: " + dadAge);
        System.out.println("My firstName from my parents (childs grand parent is" + firstName);
    }

    void displayName() {
        System.out.println(super.lastname);
        System.out.println(lastName);
    }


}
//}
