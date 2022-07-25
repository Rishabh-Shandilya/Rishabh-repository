package com.Assignment.basic;

import java.util.Scanner;

public class Q11_SquareRoot {
    public static void main(String[] args) {
		double x;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the value for which you want to find the square root of");
			x= input.nextInt();
		}
		double sqrrt= Math.sqrt(x);
		System.out.println("The square root of the number is: "+ String.format("%.3f", sqrrt));
		
	}
}
