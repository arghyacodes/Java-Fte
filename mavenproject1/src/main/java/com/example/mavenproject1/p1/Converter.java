package com.example.mavenproject1.p1;
import java.util.Stack;

public class Converter {
	Stack<Integer> stack = new Stack<>();
	public static void main() {
		int a = Read.sc.nextInt();
		}
	public void octal(int a) {
		int k = a;
		while(a != 0) {
			stack.push(a%8);
			a = a/8;
		}
		System.out.println("\nOctal output of "+k+" is :");
		while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
	}
	public void binary(int a) {
		int k = a;
		while(a != 0) {
			stack.push(a%2);
			a = a/2;
		}
		System.out.println("\nBinary Output of "+k+" is :");
		while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
	}
	}

