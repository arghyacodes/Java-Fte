package com.example.mavenproject1.p2;

public class Add extends Arithmetic{	//Inheritance

	public void cal() {
		this.num3 = num1 + num2;
	}
	//Overriding
	public void display() {
		System.out.println("Sum = ");
		super.display();
	}
}
