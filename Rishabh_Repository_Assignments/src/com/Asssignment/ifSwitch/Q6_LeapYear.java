package com.Asssignment.ifSwitch;

import java.util.Scanner;

public class Q6_LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the year to check whether it is leap year or not");
		year=input.nextInt();
		
		if (((year%4==0)&&(year%100!=0))|| (year%400==0)) {
			System.out.println(year+" is a leap year");
		}//end if
		else {
			System.out.println(year+" is not a leap year");
		}
	}// end main
}// end class
