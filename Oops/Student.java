package com.Oops;

public class Student {
	
	String name;
	int age;
	
	public void details() {
		System.out.println("Name= "+name+" and age = "+age);
	}

	public void printt() {
		String name="kamlesh";
		System.out.println("Name= "+name+" and age = "+age);
		System.out.println("Name= "+this.name+" and age = "+this.age);
	}
}
