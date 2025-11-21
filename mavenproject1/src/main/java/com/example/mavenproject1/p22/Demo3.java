package com.example.mavenproject1.p22;

public class Demo3 {

	public static void main(String[] args) {
		EncaptulationDemo ob = new EncaptulationDemo();
		// Private member so can not be accessed System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		
		// Private member ob.f1();
		ob.f2();
		ob.f3();
		ob.f4();
	}

}
