package com.Assignment.basic;

import java.util.Scanner;

public class Q14_AreaOfEquilateralTriangle {
	public static void main(String[] args) {
       int side;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the side of equilateral triangle: ");
	   side=input.nextInt();
	   
	   double area= (1.732*side*side)/4;
	   System.out.println("The area of your equilateral triangle is: "+ area);
	
	}// end main
}// end class
