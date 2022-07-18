package com.Assignment.basic;

import java.util.Scanner;

public class Q16_CompundInterest {
	public static void main(String[] args) {
		Double PrincipalBal,Rate,Time, CompoundInterst, n=1.0;
		Scanner input= new Scanner(System.in);
		System.out.println("To know the simple interest on your loan "
				+ "Kindly enter the Principal Balanve, Rate and"
				+ " Time period");
		System.out.print("Principal Balance: ");
		PrincipalBal=input.nextDouble();
		System.out.print("Rate of interest: ");
		Rate=input.nextDouble();
		System.out.print("Time: ");
		Time=input.nextDouble();
		
		CompoundInterst=  PrincipalBal*(1 + Rate/n)*Time;
		System.out.println("The compound interest on your Principal balance is: "+CompoundInterst);
	}//end main
}//end class