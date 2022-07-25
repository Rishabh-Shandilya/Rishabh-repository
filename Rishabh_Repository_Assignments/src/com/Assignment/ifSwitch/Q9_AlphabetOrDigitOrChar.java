package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q9_AlphabetOrDigitOrChar {
	public static void main(String[] args) {
		char c;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a character to check whether it is alphabet or digit or number");
			c=input.next().charAt(0);
		}
		if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
			System.out.println(c+ " is an Alphabet");
		}
		else if (c>='0'&&c<='9') {
			System.out.println(c+" is a number");
		}
		else {
			System.out.println(c+" is a character");
		}
				
	}// end main
}// end class
