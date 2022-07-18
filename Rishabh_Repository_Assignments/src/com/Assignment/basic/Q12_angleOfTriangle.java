
package com.Assignment.basic;

import java.util.Scanner;

public class Q12_angleOfTriangle {
 public static void main(String[] args) {
	int angle1, angle2;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter angle 1: ");
	angle1=input.nextInt();
	System.out.print("Enter angle 2: ");
	angle2= input.nextInt();
	
	if ((angle1+angle2)<180) {
		int angle3= 108-(angle1-angle2);
		System.out.println("The third angle is: "+ angle3);
	}//end if
	else {
		System.out.println("Error not a triangle");
	}
	
	
 }//end main
}//end class
