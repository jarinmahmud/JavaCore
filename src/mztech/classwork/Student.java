package mztech.classwork;

public class Student {
     int age;
    //double y =1;
    String name;

    Student (int studentAge, String fullName){
        age = studentAge;
        name = fullName;

        System.out.println("Student Name: " +name);
        System.out.println("Student Age: " +age);
    }
}