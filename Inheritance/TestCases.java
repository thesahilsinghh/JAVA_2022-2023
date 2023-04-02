package com.Inheritance;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// case 1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
//		obj.fun();
//		obj.fun2();

		// case 2
//		P obj = new C();
//		System.out.println(obj.d);// 2
//		System.out.println(obj.d2);// 20
//		System.out.println(((C) (obj)).d);
//		System.out.println(((C) (obj)).d1);
//
//		obj.fun();
//		obj.fun2();
//		((C) (obj)).fun1();
//		

		/*
		 * case 3(not allowed) parent class cannot inherit c class space will be
		 * allocated to only parent class data member not class c
		 */

//		C obj = new p();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);

		// case 4

		C obj = new C();

		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P) (obj)).d);
	}

}
