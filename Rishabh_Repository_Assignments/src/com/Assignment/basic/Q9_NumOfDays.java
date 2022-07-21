package com.Assignment.basic;

import java.util.Scanner;

public class Q9_NumOfDays {
	  public static void main(String[] args) {
	        int NumDays, NumMonths, NumYears;
	        int NumWeek,  DaysLeft;
	        Scanner input= new Scanner(System.in);
	        System.out.println("Enter the number of days");
	        NumDays=input.nextInt();
	        NumYears=NumDays/365;
	        System.out.print("In "+NumDays+" days, there are "+NumYears+" years ");
	        DaysLeft=NumDays%365;
	        NumMonths= DaysLeft/30;
	        DaysLeft=NumDays%30;
	        System.out.print(NumMonths+" months ");
	        NumWeek=DaysLeft/7;
	        System.out.println(NumWeek+" weeks left");
	   
	    }//end main
}
