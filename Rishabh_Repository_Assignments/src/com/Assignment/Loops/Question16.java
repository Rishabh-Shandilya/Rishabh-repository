package com.Assignment.Loops;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
		int num, temp1, rev = 0;
		System.out.println("Enter a number to print its reverse");
		try (Scanner input = new Scanner(System.in)) {
			num = input.nextInt();
		} // end try
		while (num != 0) {
			temp1 = num % 10;
			rev = rev * 10 + temp1;
			num = num / 10;
		} // end while
		System.out.println("The reverse of the number is: " + rev);
	}// end main
}// end class
