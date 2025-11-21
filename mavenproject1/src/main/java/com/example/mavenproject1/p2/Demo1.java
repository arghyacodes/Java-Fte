package com.example.mavenproject1.p2;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Add obj = new Add();	//both subject and reference of same type so tightly coupled
		Arithmetic obj = new Add();	//Loosely coupled technique
		obj.setData(12, 17);
		obj.cal();
		obj.display();
		
		obj = new Subtraction();	//will not throw error in loosely coupling
		obj.setData(30, 20);
		obj.cal();
		obj.display();
	}

}
