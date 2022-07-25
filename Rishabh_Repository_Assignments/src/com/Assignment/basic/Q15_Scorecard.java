package com.Assignment.basic;

import java.util.Scanner;

public class Q15_Scorecard {
	public static void main(String[] args) {
		double sub1,sub2,sub3,sub4,sub5, total, perc, avg;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the marks of Subject 1: ");
			sub1=input.nextDouble();
			System.out.print("Enter the marks of Subject 2: ");
			sub2=input.nextDouble();
			System.out.print("Enter the marks of Subject 3: ");
			sub3=input.nextDouble();
			System.out.print("Enter the marks of Subject 4: ");
			sub4=input.nextDouble();
			System.out.print("Enter the marks of Subject 5: ");
			sub5=input.nextDouble();
		}
		total=sub1+sub2+sub3+sub4+sub5;
		avg=total/5;
		perc=total/5;
		
		System.out.println("Total marks scored by you are: "+ total);
		System.out.println("Average marks  by you are: "+ avg);
		System.out.println("Total marks Percentage by you are: "+ perc);
		
		
	}//end main
}//end class
