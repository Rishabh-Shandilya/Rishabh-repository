package com.Assignment.ifSwitch;

import java.util.Scanner;


public class Q14_AnglesOfTriangles {

	public static void main(String[] args) {
		int ang1, ang2, ang3;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the angles of a triangle to check whether it is valid or not");
			ang1=input.nextInt();
			ang2=input.nextInt();
			ang3=input.nextInt();
		}
		if ((ang1+ang2+ang3)==180) {
			System.out.println("The triangle is valid");
		}//end if
		else {
			System.out.println("Sorry! this is an invalid triangle");
		}//end else
	}//end main
}//end class
