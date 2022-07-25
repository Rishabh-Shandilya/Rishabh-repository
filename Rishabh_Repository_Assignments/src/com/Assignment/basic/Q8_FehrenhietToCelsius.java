package com.Assignment.basic;

import java.util.Scanner;

public class Q8_FehrenhietToCelsius {
	 public static void main(String[] args) {
	        Double temp;
	        System.out.println("Enter the temprature in Fahrenheit");
	        try (Scanner input = new Scanner(System.in)) {
				temp=input.nextDouble();
			}
	        System.out.println("The coversion to celsius is: "+FahrenheitToCelsius(temp));
	    }//end main

	    public static double FahrenheitToCelsius(Double temp){
	       double C = (temp - 32) * 5/9;
	        return C;
}
}
