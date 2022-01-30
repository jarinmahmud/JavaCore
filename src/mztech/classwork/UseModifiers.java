package mztech.classwork;

public class UseModifiers {
    //The static modifier for creating class methods and variables.
    static final double pi = 3.14;

    public static void main (String args[]){
        AccessModifiers mod = new AccessModifiers(); // creating object/instance

        //static modifiers cannot be declared here, only at class level
        //Available properties from object
        System.out.println(mod.protectedName);
        System.out.println(mod.name);
        System.out.println(mod.publicName);
    }
}
