package mztech.Encapsulation;

public class MainHw {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Jim");
        s.setAge(20);
        s.setGrade("Junior");

        System.out.println("Hi, my name is " + s.getName() + "," + " and I am a " + s.getAge() + " year old " + s.getGrade() +
                " in college.");
    }
}