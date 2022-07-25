package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q11_WeekDay {
	public static void main(String[] args) {
		int week;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the week number to know the weekday");
			week=input.nextInt();
		}
		switch (week) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;

		default:
			System.out.println("!!! Error... wrong input");
			break;
		}
	}//end main
}// end class
