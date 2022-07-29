package com.Assignment.Loops;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		int n;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number");
			n = input.nextInt();
		}
		while (n >= 1) {
			System.out.println(n);
			n--;
		}
	}// end main
}// end class
