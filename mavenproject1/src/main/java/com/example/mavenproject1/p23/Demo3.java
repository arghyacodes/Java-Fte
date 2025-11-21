package com.example.mavenproject1.p23;

import com.example.mavenproject1.p1.Read;

public class Demo3 {

	public static void main(String[] args) {
		int balance = 25000;
		try {System.out.println("Enter amount to withdraw");
		int amt = Read.sc.nextInt();
		if(amt>balance) {
			throw new InsufficientBalance();
		}
		System.out.println("Please wait, your Transaction is under process");
		} catch (InsufficientBalance e) {
			System.out.println(e.getMessage());
		}
	}

}
