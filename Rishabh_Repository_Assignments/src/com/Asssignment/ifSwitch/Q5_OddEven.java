package com.Asssignment.ifSwitch;

import java.util.Scanner;

public class Q5_OddEven {
	public static void main(String[] args) {
		int num;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number to check whether it is Odd/Even or not");
		num=input.nextInt();
		if(num%2==0) {
			System.out.println(num+" is and even number");
		}//end if
		else {
			System.out.println("The number is Odd");
		}//end else
	}//end main
}// end class
