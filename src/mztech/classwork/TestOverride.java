package mztech.classwork;

public class TestOverride {
    //Syntax of overriding
    //ParentClass object =new ChildClass();

    public static void main(String[] args) {
        BaseClass obj1 = new BaseClass();
        BaseClass obj2 = new DerivedClass();

        obj1.methodToOverride(); //I'm the method of Base class.
        obj2.methodToOverride(); // Although it is object of BaseClass, it will print : I'm the method of derived class.
        //Because it is overrided by derived class
    }
}
