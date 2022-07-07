package homework;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {

        ChildClass object = new ChildClass();//it is an option, specifying
        //it works without creating the object too, why creating object then?for constructor?as far we know child class inherites the parent constructor too...

        System.out.println(lastName);
        object.printFirstName();

        ParentClass pobject = new ParentClass();
        ParentClass p = new ChildClass();
        //It cant be ChildClass c = new ParentClass(); because ParentClass cannot inherit ChildClass.

        pobject.favoriteFood();// can be written super.favoritefood(); but super keyword requires non-static method to compile/run.
        p.favoriteFood();
        //super.favoriteFood();----> can't be run because main method is static.

    }

    public void favoriteFood() {
        System.out.println("Child's favorite food is pasta. ");
        super.favoriteFood();//prints parent class favoriteFood();
    }


}
