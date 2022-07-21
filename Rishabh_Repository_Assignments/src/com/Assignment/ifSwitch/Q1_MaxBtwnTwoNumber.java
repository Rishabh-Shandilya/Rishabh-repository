package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q1_MaxBtwnTwoNumber {
	public static void main(String[] args) {
		int num1, num2;
		Scanner input= new Scanner(System.in);
			System.out.println("Enter two numbers to find the maximum between them");
			num1= input.nextInt();
			num2=input.nextInt();
			
			if (num1>num2) {
				System.out.println(num1+" is bigger than "+num2);
			}//end if
			else if (num1==num2) {
				System.out.println(num2+" is equal to "+num2);
			}//end else if
			else {
				System.out.println(num2+" is bigger than "+num1);
			}// end else
		
	}//end main
}//end class
