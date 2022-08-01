package com.Assignment.Loops;

import java.util.Scanner;

public class Question17 {
	public static void main(String[] args) {
		int n;
		int b = 0;
		int a = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			n = sc.nextInt();
		} // end try

		while (n != 0) {
			b = n % 10;
			a = a * 10 + b;
			n = n / 10;
		} // end while
		if (a == n) {
			System.out.println("Number is a Palindrome number");
		} // end if
		else {
			System.out.println("Number is not a Palindrome number");
		} // end else

	}// end main
}// end class
