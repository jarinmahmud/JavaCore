package mztech.classwork;

public class studentobject {
    int id;
    String name;
}

class TestStudent3 {
    //A class — in the context of Java — is a template used to create objects and to define object data types and methods.
    // Classes are categories, and objects are items within each category. All class objects should have the basic class properties.
    public static void main(String args[]) {
        //Creating objects
        //A Java object is a member (also called an instance) of a Java class. Each object has an identity, a behavior and a state.
        // The state of an object is stored in fields (variables), while methods (functions) display the object's behavior.
        studentobject s1 = new studentobject();
        studentobject s2 = new studentobject();
        //Initializing objects
        s1.id = 01;
        s1.name = "Jarin";
        s2.id = 02;
        s2.name = "Joe";
        //Printing data
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}

