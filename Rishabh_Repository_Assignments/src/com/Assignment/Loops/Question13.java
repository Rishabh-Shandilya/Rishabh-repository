package com.Assignment.Loops;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to reverse");
			n = sc.nextInt();
		} // end for
		int arr[] = new int[6];
		int k = 0;
		while (n != 0) {
			int d = 0;
			d = n % 10;
			arr[k++] = d;
			n = n / 10;
		}
		int b = 0;
		int arr1[] = new int[6];
		for (int i = k - 1; i >= 0; i--)

		{
			arr1[b++] = arr[i];

		}
		int temp = arr1[0];
		arr1[0] = arr1[b - 1];
		arr1[b - 1] = temp;

		for (int i = 0; i < arr1.length - 2; i++) {
			System.out.print(arr1[i]);
		}//end try
	}// end main
}// end class
