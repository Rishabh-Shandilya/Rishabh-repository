package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q20_ElectricityUnit {
	public static void main(String[] args) {
		double unit;
		double bill=0;
		System.out.print("Enter the number of electricity units: ");
		try (Scanner input = new Scanner(System.in)) {
			unit=input.nextInt();
		}
		if (unit<=50) {
			bill= unit*0.50;
		}//end if
		else if (unit<=150&&unit>50) {
			bill= (50*0.5)+((unit-50)*0.75);
		}//end else if
		else if (unit<=250&&unit>=150) {
			bill=(50*0.5)+((unit-50)*0.75)+((unit-150)*1.20);
		}//end else if
		else if (unit>250) {
			bill=(50*0.5)+((unit-50)*0.75)+((unit-150)*1.20)+((unit-250)*150);
		}
		else {
			System.out.println("There is no bill.. you are free to go");
		}
		System.out.println("the bill is:"+ (bill+ (bill*0.2)));
	}//end main
}// end class
