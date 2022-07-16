package com.Assignment.basic;

import java.util.Scanner;

public class Q3_ParameterOfRectangle {
    public static void main(String[] args) {
		int l,b;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the lenght and widhth of the rectangle");
		l=input.nextInt();
		b=input.nextInt();
		
	System.out.println("The Perimeter of the rectangle is: "+ (2*(l+b)));
	}//end main
}//end class
