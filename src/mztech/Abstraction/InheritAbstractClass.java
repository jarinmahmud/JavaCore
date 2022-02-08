package mztech.Abstraction;

public abstract class InheritAbstractClass extends Abstract {
    public static void main(String[] args) {
        //get properties from parent class with inheritance
        System.out.println(("Public address : " + publicAddress));

        //overriding
        Abstract obj = new InheritAbstractClass() {
            @Override
            public void printName() {

            }

            @Override
            public void printAddress() {

            }
        };

        //Using method from current class
        obj.printName();

        add();

        System.out.println("Private address: " + obj.getAddress());

    }

}
