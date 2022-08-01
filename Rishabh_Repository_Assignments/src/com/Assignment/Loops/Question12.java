package com.Assignment.Loops;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		int num, temp, temp2 = 0;
		System.out.println("Enter the number to count its digits");
		try (Scanner input = new Scanner(System.in)) {
			num = input.nextInt();
		} // end try
		temp = num % 10;
		while (num != 0) {
			temp2 = num % 10;
			num = num / 10;
		} // end while
		System.out.println("sum of first and last digit is: " +(temp+ temp2));
	}// end main
}// end class
