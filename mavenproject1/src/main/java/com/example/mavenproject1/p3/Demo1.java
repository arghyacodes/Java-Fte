
package com.example.mavenproject1.p3;

public class Demo1 {
public static void main(String[] args) {
	IsMath obj = (x,y)->(x+y);
	IsMath obj1 = (x,y)->{int z = x-y;
		return z;};	//for {} return is needed
		System.out.println(obj.cal(10, 20));
		System.out.println(obj1.cal(30, 10));
		f1((x,y)->(x/y),10,2);
		f1((x,y)->(x*y),10,2);
		
	}
	public static void f1 (IsMath obj,int a,int b) {
		System.out.println(obj.cal(a, b));
	}
}

@FunctionalInterface
interface IsMath{
	public int cal(int a, int b);
//	public void cal1(); Doesn't work
}