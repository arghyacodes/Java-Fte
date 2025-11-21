package com.example.mavenproject1.p23;

public class InsufficientBalance extends Exception{

	public InsufficientBalance() {
		super("Fund Insufficient, your transaction is cancelled");
	}

		
}
