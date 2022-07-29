package com.Assignment.Loops;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		int n, temp = 0;
		System.out.println("Enter a number");
		try (Scanner input = new Scanner(System.in)) {
			n = input.nextInt();
		} // end try
		for (int i = 0; i <= n; i++) {
			temp += i;
		} // end for
		System.out.println(temp);
	}// end main
}// end class
