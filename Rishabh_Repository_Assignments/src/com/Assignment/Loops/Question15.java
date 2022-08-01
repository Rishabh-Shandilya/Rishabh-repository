package com.Assignment.Loops;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		int num, temp, sum = 1;
		System.out.println("Enter a number to calculate all its digits");
		try (Scanner input = new Scanner(System.in)) {
			num = input.nextInt();
		} // end try
		while (num != 0) {
			temp = num % 10;
			sum = sum * temp;
			num = num / 10;
		} // end for
		System.out.println("The Product of the numbers are: " + sum);

	}// end main
}
