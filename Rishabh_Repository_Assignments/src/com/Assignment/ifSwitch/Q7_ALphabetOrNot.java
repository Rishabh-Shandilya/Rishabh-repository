package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q7_ALphabetOrNot {
	public static void main(String[] args) {
		char c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a character to check whether it is alphabet or not");
		c=input.next().charAt(0);
		if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
			System.out.println(c+ " is an Alphabet");
		}else {
			System.out.println(c+" is not an alphabet");
		}//end if-else
	}//end main
}//end class
