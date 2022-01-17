package mztech.classwork;

public class AccessModifiers {
    //Non-access Modifiers
    private static int numInstances = 0;
    //visible to the world - public.
     public String publicName = "Public Name";
     //Visible to the package and all subclasses - protected
     protected String protectedName = "Protected Name";
    //visible to the package, the default. No modifiers are needed.
    String name = "John";
    //visible to the class only. (private)
    private String privateName = "Private Name";

    protected static int getCount(){
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    //Static vs Final : https://techdifferences.com/difference-between-static-and-final-in-java.html

}
