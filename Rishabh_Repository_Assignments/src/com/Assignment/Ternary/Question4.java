package com.Assignment.Ternary;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year");
		int year = sc.nextInt();
		String d = (year % 4 == 0
				? ((year % 100 == 0) ? ((year % 400 == 0) ? "Leap year" : "Not a leap year") : "Leap year")
				: "Not a leap year");

		System.out.println(d);
		sc.close();
	}
}
