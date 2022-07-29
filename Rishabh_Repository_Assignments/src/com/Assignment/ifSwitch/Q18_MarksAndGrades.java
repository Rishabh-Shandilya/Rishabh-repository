package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q18_MarksAndGrades {
	public static void main(String[] args) {
		int marks[]=new int[5];
		int sum = 0, num;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the marks of all subject one by one");
			for(int i=0;i<5;i++)
			{
				num=input.nextInt();
				marks[i]=num;
				sum += marks[i];
			}
		}
		int percent = sum/5;
		System.out.println("Your percentage is: "+percent);
		if(percent >= 90 && percent < 100)
		{
		System.out.println("Your Grade is A");
		}
		else if(percent >= 80 && percent < 90)
		{
			System.out.println("Your Grade is B");
		}
		else if(percent >= 70 && percent < 80)
		{
			System.out.println("Your Grade is C");
		}	
		else if(percent >= 60 && percent < 70)
		{
			System.out.println("Your Grade is D");
		}
		else if(percent >= 50 && percent < 60)
		{
			System.out.println("Your Grade is E");
		}
		else if(percent >= 40 && percent < 50)
		{
			System.out.println("Your Grade is F");
		}
		else
		{
			System.out.println("You failed");
		}	}
}// end class
