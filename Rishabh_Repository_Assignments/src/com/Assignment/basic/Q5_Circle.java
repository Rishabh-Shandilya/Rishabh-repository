package com.Assignment.basic;

import java.util.Scanner;

public class Q5_Circle {

	  static double p= 3.14;
	    public static void main(String[] args) {
	        int r;
	        Scanner input= new Scanner(System.in);
	        System.out.println("Enter the radius of the circle");
	        r=input.nextInt();
	        System.out.println("The diameter of the circle is: " +diameter(r));
	        System.out.println("The circumference of the circle is: " +circumference(r));
	        System.out.println("The Area of the circle is: " +area(r));
	    }//end main

	    public static int diameter(int r){
	        return r*2;
	 }//end diameter
	    public static double circumference(int r){
	        double c= 2*p*r;
	        return c;
	    }//end circumference
	    public static double area(int r){
	        double a= p*r*r;
	        return a;
	    }//end area
}
