package com.example.mavenproject1.p22;

public class Demo1 {

	public static void main(String[] args) {
		AddDto dto = new AddDto();
		dto.setNum1(40);
		dto.setNum2(30);
		
		Arithmetic2 obj = new Add();
		obj.setData(dto);
		obj.cal();
		obj.display();
		
		
		obj = new Subtraction();
		obj.setData(dto);
		obj.cal();
		obj.display();
	}

}
