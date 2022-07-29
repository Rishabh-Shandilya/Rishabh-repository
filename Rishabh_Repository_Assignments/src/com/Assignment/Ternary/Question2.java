package com.Assignment.Ternary;

public class Question2 {
	public static void main(String[] args) {
		int a = 8;
		int b = 9;
		int c = 5;
		int d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);

		System.out.println("Largest number : " + d);
	}
}
