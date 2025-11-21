package assignment;

public class Demo1 {

	public static void main(String[] args) {
		Matrix ob1 = new Matrix(2,2);
		ob1.readMatrix();
		Matrix ob2 = new Matrix (ob1);
		Matrix ob3 = ob1.add(ob2);
		ob1.display();
		System.out.println();
		ob2.display();
		System.out.println();
		ob3.display();
//		System.out.println();
	}

}
