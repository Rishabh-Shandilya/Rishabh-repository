package com.Assignment.basic;

import java.util.Scanner;

public class Q9_NumOfDays {
	  public static void main(String[] args) {
	        int days;
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter the number of days you wan to convert into weeks, months and years");
	        days= input.nextInt();
	        ConvertIntoWeeks(days);
	        ConvertIntoMonths(days);
	        ConvertIntoYears(days);
	    }//end main

	    public static void ConvertIntoWeeks(int days){
	        double weeks=days/7;
	        System.out.println("No. of days converted int weeks is: "+ weeks);
	    }//end weeks
	    public static void ConvertIntoMonths(int days){
	        double months;
	        months=days/30;
	        System.out.println("No. of days converted int months is: "+ months);
	    }//end weeks
	    public static void ConvertIntoYears(int days){
	        double years=days/365;
	        System.out.println("No. of days converted int years is: "+years);
	    }//end weeks
}
