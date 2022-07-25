package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q2_MaxBtwnThreeNum {
public static void main(String[] args) {
	int num1, num2, num3;
	try (Scanner input = new Scanner(System.in)) {
		System.out.println("Enter three numbers to find the maximum between them");
		num1= input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
	}
		if (num1>num2&&num1>num3) {
			System.out.println(num1+" is the maximum");
		}//end if
		else if (num2>num3&&num2>num1) {
			System.out.println(num2+" is the maximum");
		}//end else if
		else if (num3>num1&& num3>num2) {
			System.out.println(num3+" is the maximum");
		}//end else if
}//end main
}//end class
