package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q19_GrossSalary {
	public static void main(String[] args) {
		int Salary, result;
		System.out.println("Enter the basic salary paid to you");
		try (Scanner input = new Scanner(System.in)) {
			Salary=input.nextInt();
		}
		if (Salary<=10000) {
			result= Salary+ ((20*Salary)/100)+((80*Salary)/100);
			System.out.println("Your gross salary is: "+ result);
		}
		else if (Salary<=20000) {
			result= Salary+ ((25*Salary)/100)+((90*Salary)/100);
			System.out.println("Your gross salary is: "+ result);
		}
		else {
			result= Salary+ ((30*Salary)/100)+((95*Salary)/100);
			System.out.println("Your gross salary is: "+ result);
		}
	}//end main
}//end class
