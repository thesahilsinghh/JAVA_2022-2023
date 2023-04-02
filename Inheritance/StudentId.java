package com.Inheritance;

public class StudentId {

	String name;
	int age;

	public StudentId() {

	}

	public StudentId(String s, int n) {
		this.name = s;
		this.age = n;
	}
	
	public String toString() {
		return this.name+" "+this.age;
	}
	

}
