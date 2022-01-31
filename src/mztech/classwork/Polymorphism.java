package mztech.classwork;

public class Polymorphism {
    //Polymorphism is one of the OOPs feature that allows us to perform a single action in different ways.
    //For example, lets say we have a class Animal that has a method sound() . Since this is a generic class so we can't give it a implementation like: Roar, Meow, Oink etc.

    //Overriding and Overloading are the core concepts in Java programming. They are the ways to implement polymorphism in our java programs. Polymorphism is one of the OOPS Concepts.


    //When two or more methods in the same class have the same name but different parameters, it’s called Overloading.

    //When the method signature (name and parameters) are the same in the superclass and the child class, it’s called Overriding.

    /*
    Overriding implements Runtime Polymorphism whereas Overloading implements Compile time polymorphism.
The method Overriding occurs between superclass and subclass. Overloading occurs between the methods in the same class.
Overriding methods have the same signature i.e. same name and method arguments. Overloaded method names are the same but the parameters are different.
With Overloading, the method to call is determined at the compile-time. With overriding, the method call is determined at the runtime based on the object type.
If overriding breaks, it can cause serious issues in our program because the effect will be visible at runtime. Whereas if overloading breaks, the compile-time error will come and it’s easy to fix.
     */

    /*
    CODE EXAMPLE

    package com.journaldev.examples;

import java.util.Arrays;

public class Processor {

	public void process(int i, int j) {
		System.out.printf("Processing two integers:%d, %d", i, j);
	}

	public void process(int[] ints) {
		System.out.println("Adding integer array:" + Arrays.toString(ints));
	}

	public void process(Object[] objs) {
		System.out.println("Adding integer array:" + Arrays.toString(objs));
	}
}

class MathProcessor extends Processor {

	@Override
	public void process(int i, int j) {
		System.out.println("Sum of integers is " + (i + j));
	}

	@Override
	public void process(int[] ints) {
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		System.out.println("Sum of integer array elements is " + sum);
	}

}
     */
}
