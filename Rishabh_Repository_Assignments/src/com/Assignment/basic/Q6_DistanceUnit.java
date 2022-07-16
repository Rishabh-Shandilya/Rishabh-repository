package com.Assignment.basic;

import java.util.Scanner;

public class Q6_DistanceUnit {
	 public static void main(String[] args) {
	        int length;
	        System.out.println("Ener the lenght in centimeter to convert it into mtr and km");
	        Scanner input= new Scanner(System.in);
	        length=input.nextInt();
	        System.out.println("centimeter into meter is: "+ CovertIntoMeter(length));
	        System.out.println("centimeter into Kilometer is: "+ CovertIntoKilometer(length));

	    }//end main

	    public static double CovertIntoMeter(double centimeter){
	       return centimeter/100;
	    }//end convert into meter
	    public static double CovertIntoKilometer(double centimeter){
	       return centimeter/1000;
	    }//end convert into kilometer
}
