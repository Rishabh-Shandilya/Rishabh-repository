package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Switch5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int number = sc.nextInt();
		int ans = (number % 2 == 0) ? 1 : 0;
		switch (ans) {
		case 1:
			System.out.println("Even number");
			break;
		case 0:
			System.out.println("Odd number");
			break;
		}
		sc.close();
	}
}
