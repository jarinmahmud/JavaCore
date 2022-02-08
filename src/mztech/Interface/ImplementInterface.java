package mztech.Interface;

public class ImplementInterface implements InterfaceClass, InterfaceClassTwo {
    private int age;

    public static void main(String[] args) {
        ImplementInterface obj = new ImplementInterface();
        obj.printName();
        System.out.println(obj.age);
        obj.printBirthday();
    }

    public void printBirthday() {
    }

    public void printName() {
    }
}
