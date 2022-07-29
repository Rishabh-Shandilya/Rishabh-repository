package com.Assignment.TrianglePattern;

public class Q2_Pattern {
	public static void main(String[] args) {
		int n = 5, i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= (2 * i - 1); j++) {
				if (j <= i)
					System.out.print(j);
				else
					System.out.print((2 * i - 1) - (j - 1));
			}

			System.out.println();
		}
	}
}
