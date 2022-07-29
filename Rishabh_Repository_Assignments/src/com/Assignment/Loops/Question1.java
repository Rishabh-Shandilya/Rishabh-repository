package com.Assignment.Loops;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		int n, i = 1;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number");
			n = input.nextInt();
		}
		while (i <= n) {
			System.out.println(i);
			i++;
		}
	}// end main
}// end class
