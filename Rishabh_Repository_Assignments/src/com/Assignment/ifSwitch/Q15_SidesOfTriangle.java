package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q15_SidesOfTriangle {
	public static void main(String[] args) {
		int side1, side2, side3;
		System.out.println("Enter the sides of triangle to check whether a triangle is valid or not");
		try (Scanner input = new Scanner(System.in)) {
			side1 = input.nextInt();
			side2 = input.nextInt();
			side3 = input.nextInt();
		}
		if ((side1 < side3 + side2) && (side2 < side1 + side3) && (side3 < side1 + side2)) {
			System.out.println("The triangle is valid");
		} // end if
		else {
			System.out.println("The triangle is not valid");
		} // end else
	}// end main
}// end class
