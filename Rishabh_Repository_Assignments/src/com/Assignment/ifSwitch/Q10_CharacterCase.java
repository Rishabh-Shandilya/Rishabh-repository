package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q10_CharacterCase {
	public static void main(String[] args) {
		char ch;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a character to check whether it is uppercase or lowercase");
			ch = input.next().charAt(0);
		}
		if (ch>='a'&&ch<='z') {
			System.out.println(ch+" is a lowercase");
		}//end if
		else if (ch>='A'&&ch<='Z') {
			System.out.println(ch+" is an uppercase");
		}//end else if
	}// end main
}// end class
