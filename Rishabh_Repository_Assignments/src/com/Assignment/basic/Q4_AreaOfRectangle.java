package com.Assignment.basic;

import java.util.Scanner;

public class Q4_AreaOfRectangle {
	   public static void main(String[] args) {
	        int l, b;
	        try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter length and breadth to find the area of a rectangle");
				l= input.nextInt();
				b=input.nextInt();
			}
	        System.out.println("The area of the Rectangle is: "+ (l*b));
	    }
}
