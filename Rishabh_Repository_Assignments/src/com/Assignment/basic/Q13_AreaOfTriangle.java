package com.Assignment.basic;

import java.util.Scanner;

public class Q13_AreaOfTriangle {

	public static void main(String[] args) {
		double base, height;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base of the triangle: ");
		base= input.nextDouble();
		System.out.print("Enter the height of the triangle: ");
		height=input.nextDouble();
		double area= (base*height)/2;
		System.out.println("The area of the triangle is: "+ area);
		
	}//end main
}//end class
