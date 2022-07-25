package com.Assignment.basic;

import java.util.Scanner;

public class Q16_SimpleInterest {
	public static void main(String[] args) {
		Double PrincipalAmt,Rate,Time, SimpleInterst;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("To know the simple interest on your loan "
					+ "Kindly enter the Principal amount, Rate and"
					+ " Time period");
			System.out.print("Principal amount: ");
			PrincipalAmt=input.nextDouble();
			System.out.print("Rate of interest: ");
			Rate=input.nextDouble();
			System.out.print("Time: ");
			Time=input.nextDouble();
		}
		SimpleInterst= (PrincipalAmt*Rate*Time)/100;
			System.out.println("The simple interst on your loan is: "+ SimpleInterst);
	}//end main
}//end class
