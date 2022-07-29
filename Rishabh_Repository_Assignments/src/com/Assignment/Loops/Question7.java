package com.Assignment.Loops;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		int n, temp = 0;
		System.out.println("Enter a number");
		try (Scanner input = new Scanner(System.in)) {
			n = input.nextInt();
		} // end try
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				temp += i;
			} // end if
		} // end for
		System.out.println(temp);
	}// end main
}// end class
