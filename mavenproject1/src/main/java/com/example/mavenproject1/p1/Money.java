package com.example.mavenproject1.p1;

import java.util.Stack;

public class Money {
//	int money = 0;
	
	public void convo(long a) {
		Stack<Integer> num = new Stack<>();
//		int i = 0;
		while(a != 0) {
			num.push((int) (a%10));
//			i++;
			a = a/10;
		}
		while (!num.isEmpty()) {
           int k = num.peek();
           switch(k) {
           case 1:
        	   System.out.print("One ");
        	   num.pop();
        	   break;
           case 2:
        	   System.out.print("Two ");
        	   num.pop();
        	   break;
           case 3:
        	   System.out.print("Three ");
        	   num.pop();
        	   break;
           case 4:
        	   System.out.print("Four ");
        	   num.pop();
        	   break;
           case 5:
        	   System.out.print("Five ");
        	   num.pop();
        	   break;
           case 6:
        	   System.out.print("Six ");
        	   num.pop();
        	   break;
           case 7:
        	   System.out.print("Seven ");
        	   num.pop();
        	   break;
           case 8:
        	   System.out.print("Eight ");
        	   num.pop();
        	   break;
           case 9:
        	   System.out.print("Nine ");
        	   num.pop();
        	   break;
           case 0:
        	   System.out.print("Zero ");
        	   num.pop();
        	   break;
           }
        }
	}
}