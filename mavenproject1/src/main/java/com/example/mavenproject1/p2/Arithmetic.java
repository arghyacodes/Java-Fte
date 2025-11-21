package com.example.mavenproject1.p2;
//Parent class
public class Arithmetic {
	int num1;
	int num2;
	int num3;
	
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;	
		}
	public void display() {
		System.out.println("Num 1 ="+num1+"Num 2 ="+num2+" Num 3= "+num3);
	}
	public void cal() {
		//Virtual function : When loosely coupled techniques methods of the sub class should be virtually defined
		//in the  super class.
	}
}
