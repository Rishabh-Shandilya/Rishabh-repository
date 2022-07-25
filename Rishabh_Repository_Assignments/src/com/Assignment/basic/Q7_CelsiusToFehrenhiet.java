package com.Assignment.basic;

import java.util.Scanner;

public class Q7_CelsiusToFehrenhiet {
	 public static void main(String[] args) {
	        Double temp;
	        System.out.println("Enter the temprature in Celsius");
	        try (Scanner input = new Scanner(System.in)) {
				temp=input.nextDouble();
			}
	        System.out.println("The coversion to Fahrenhiet is: "+CelsiusToFahrenheit(temp));
	    }//end main
	    public static double CelsiusToFahrenheit(Double temp){
	       double  F = (temp * 9/5) + 32;
	        return F;
	    }//end f to c
}//end class
