package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q8_VowelOrNot {
	public static void main(String[] args) {
		char C;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a character to check whether it is vowel or not");
		C=input.next().charAt(0);
		switch (C) {
		case 'a':
		case 'A':
			System.out.println(C+" is a vowel");
			break;
		case 'e':
		case 'E':
			System.out.println(C+" is a vowel");
			break;
		case 'i':
		case 'I':
			System.out.println(C+" is a vowel");
			break;
		case 'o':
		case 'O':
			System.out.println(C+" is a vowel");
			break;
		case 'u':
		case 'U':
			System.out.println(C+" is a vowel");
			break;

		default:
			System.out.println(C+" is not a vowel");
			break;
		}
	}//end main
}//end class
