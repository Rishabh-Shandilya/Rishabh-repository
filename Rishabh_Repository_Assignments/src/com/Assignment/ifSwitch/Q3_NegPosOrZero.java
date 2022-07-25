package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q3_NegPosOrZero {
	public static void main(String[] args) {
		int num;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number to check whether they are positive negative or zero");
			num= input.nextInt();
		}
		if (num>0) {
			System.out.println("The number is positive");
		}//end if
		else if (num<0) {
			System.out.println("The number is negative");
		}//end else if
		else {
			System.out.println("The number is 0");
		}//end else
	}// end main
}// end class
