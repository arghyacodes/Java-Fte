package com.example.mavenproject1.p2;

import com.example.mavenproject1.p1.Read;

public class Demo3 {

	public static void main(String[] args) {
		// Array of obj
		Arithmetic ob2[] = new Arithmetic[4];
		ob2[0] = new Add();
		ob2[1] = new Subtraction();
		ob2[2] = new Multiply();
		ob2[3] = new Divide();
		
		System.out.println("Enter 1 for Add, 2 for Subtraction, 3 for Multipication, 4 for Division");
		int ch = Read.sc.nextInt();
		System.out.println("Enter two Numbers :");
		ob2[ch-1].setData(Read.sc.nextInt(), Read.sc.nextInt());
		ob2[ch-1].cal();
		ob2[ch-1].display();
	}

}
