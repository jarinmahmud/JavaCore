package mztech.Inheritance;

import mztech.Inheritance.Parent;

public class Child extends Parent {
    public static void main(String[] args) {

        //Parent pr = new Parent();
        //pr.displayName();

        //System.out.println("Last Name: " + lastname);

        System.out.println("My name is using inheritance : " + firstName);

        printDadName();
        System.out.println("My grandparents first name is " + firstName);
        int myAge = 100;
        System.out.println("Dad's Age : " + myAge);


    }
}
