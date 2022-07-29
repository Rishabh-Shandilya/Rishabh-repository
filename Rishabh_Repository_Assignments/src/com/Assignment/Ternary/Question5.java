package com.Assignment.Ternary;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the character");
		int ch = sc.next().charAt(0);

		String result = (ch >= 65 && ch <= 90) ? "Character"
				: (ch >= 97 && ch <= 122) ? "Character" : "Not a Character";

		System.out.println(result);

		sc.close();

	}
}
