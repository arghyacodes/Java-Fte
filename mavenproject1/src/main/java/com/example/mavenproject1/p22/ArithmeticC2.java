package com.example.mavenproject1.p22;

public abstract class ArithmeticC2 implements Arithmetic2{
	AddDto ob;
	@Override
	public void setData(AddDto ob) {
		this.ob = ob;
	}
	@Override
	public void display() {
		System.out.println("Num 1 = "+ob.getNum1()+"Num 2 = "+ ob.getNum2()+"Num 3 = "+ob.getNum3());
		
	}

}
