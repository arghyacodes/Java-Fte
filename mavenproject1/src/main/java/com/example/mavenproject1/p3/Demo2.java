package com.example.mavenproject1.p3;

public class Demo2 {

	public static void main(String[] args) {
		//Generics - generic template i.e. class created without data type 
		Temp1<Integer> ob = new Temp1();
		ob.setData(100, 200);
		ob.display();
		
		Temp1<String> st = new Temp1();
		st.setData("Ram", "Rom");
		st.display();
		Temp2<Integer, String> nx = new Temp2();
		nx.setData(123, "OneTwoThree");
		nx.display();
	}
}
class Temp1<T>{
	T a,b;
	public void setData(T x, T y) {
		a = x;
		b= y;
	}
	public void display() {
		System.out.println(a+" "+b);
	}
}
class Temp2<T1, T2>{
	T1 a;
	T2 b;
	public void setData(T1 x, T2 y) {
		a = x;
		b= y;
	}
	public void display() {
		System.out.println(a+" "+b);
	}
}