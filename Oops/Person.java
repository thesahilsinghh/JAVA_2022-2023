package com.Oops;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void display() {
		System.out.println(this.name + " is " + this.age + " years old.");
	}
}
