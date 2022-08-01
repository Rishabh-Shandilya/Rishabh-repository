package com.Assignment.Loops;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number for table");
		try (Scanner input = new Scanner(System.in)) {
			n = input.nextInt();
		} // end try
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + n * i);
		} // end for

	}// end main
}// end class
