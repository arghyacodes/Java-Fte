package com.example.mavenproject1.p23;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("begin");
		int a = 10, b= 0;
		int c;
		try{c= new Demo2().cal(a,b) ;
			System.out.println(c);
			return;
		}
		catch(ArithmeticException e) {
			System.out.println("I'm in main "+e.getMessage());
		}
		finally {
			System.out.println("end");	
		}
	}
	public int cal(int a, int b) throws ArithmeticException{
		return a/b;
	}

}
