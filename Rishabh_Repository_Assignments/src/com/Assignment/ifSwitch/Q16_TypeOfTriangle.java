package com.Assignment.ifSwitch;

import java.util.Scanner;

import com.Assignment.Resources.Scan;

public class Q16_TypeOfTriangle {
	public static void main(String[] args) {
		int s1, s2, s3;
		System.out.println("Enter the sides of triangle to check"
				+ " whether it is equilatral or isosceles or scalene");
		try (Scanner input = new Scanner(System.in)) {
			s1=input.nextInt(); 
			s2=input.nextInt();
			s3=input.nextInt();
		}
		if (s1==s2&&s2==s3&&s1==s3) {
					System.out.println("The triangle is equilateral");
				}//end if
				else if (s1!=s2&&s2!=s3&&s3!=s1) {
					System.out.println("The traingle is Scalane");
				}//end else if
				else {
					System.out.println("The triangle is isosceles");
				}//end else
	}// end main
}// end class
