package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int first_number = sc.nextInt();
		System.out.println("Enter the second number");
		int second_number = sc.nextInt();

		int ans = (first_number < second_number) ? 1 : 0;

		switch (ans) {
		case 1:
			System.out.println("Second number is greater than first number");
			break;
		case 0:
			System.out.println("first number is greater than second number");
			break;
		}
		sc.close();
	}
}	
