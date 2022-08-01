package com.Assignment.Loops;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		int num, count = 0;
		System.out.println("Enter the number to count its digits");
		try (Scanner input = new Scanner(System.in)) {
			num = input.nextInt();
		} // end try
		while (num != 0) {
			num = num / 10;
			count += 1;
		} // end while
		System.out.println("Number of digits here: " + count);
	}// end main
}// end class
