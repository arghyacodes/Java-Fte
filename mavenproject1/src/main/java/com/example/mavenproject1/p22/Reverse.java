package com.example.mavenproject1.p22;

public class Reverse {
	public int rev(int k) {
		return Integer.parseInt(rev(String.valueOf(k)));
	}
//	public float rev(float k) {
//		
//	}
	public String rev(String k) {
		return new StringBuilder(k).reverse().toString();
	}
	public long rev(long k) {
		return Long.parseLong(rev(String.valueOf(k)));
	}
}
