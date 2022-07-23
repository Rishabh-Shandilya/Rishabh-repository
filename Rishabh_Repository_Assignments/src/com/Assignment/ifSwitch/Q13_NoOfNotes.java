package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q13_NoOfNotes {
	public static void main(String[] args) {
		int amt, notes;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total amount of money you have");
		amt = input.nextInt();
		System.out.println("Enter the base amount");
		notes = input.nextInt();
		System.out.println("The total no. of " + notes + "rs notes in " + amt + "rs are: " + (amt / notes));
	}// end main
}// end class
