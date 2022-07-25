package com.Assignment.bitwise;

import java.util.Scanner;

public class trial {
	public static void main(String[] args) {
		int num;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number to check whether it's least " + "significant bit is set or not");
			num = input.nextInt();
		}
		if((num&1)==1) {
			System.out.println("its least significant bit is 1");
		}
		else {
			System.out.println("It's least signiificant is 0");
		}

	}// end main

}// end class
