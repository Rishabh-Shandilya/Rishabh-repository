package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q4_DivisibleBy5And11 {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number to check whether it is divisible by 5 and 11 or not");
		Scanner input= new Scanner(System.in);
		num=input.nextInt();
		if((num%5)==0 && (num%11)==0) {
		System.out.println(num+" is divisible by 11 and 5");	
		}//end if
		else {
			System.out.println("Not divisible by 5");
		}
	}//end main
}// end class
