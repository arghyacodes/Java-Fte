package com.example.mavenproject1.p23;

import com.example.mavenproject1.p22.EncaptulationDemo;

public class Demo1 extends EncaptulationDemo{
	
	public static void main(String[] args) {
		EncaptulationDemo ob = new EncaptulationDemo();
		// Private member so can not be accessed System.out.println(ob.a);
		// Will not work as outside package System.out.println(ob.b);
		// Will not work as outside package System.out.println(ob.c);
		System.out.println(ob.d);
		
		// Private member ob.f1();
		// Will not work as outside package ob.f2();
		// Will not work as outside package ob.f3();
		ob.f4();

	}
	public void test() {
//		Not allowed as private System.out.println(a);
//		Not allowed as Default System.out.println(b);
		
		//Public members and member functions are allowed
		//and protected members are allowed as it has been inherited
		System.out.println(c);
		System.out.println(d);
		
		f3();
		f4();
	}

}
