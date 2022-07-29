package com.Assignment.ifSwitch;

import java.util.Scanner;

public class Q17_ProfitLoss {
	public static void main(String[] args) {
		double cost, sell;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a the cost amount");
		cost=input.nextDouble();
		System.out.println("Enter the selling amount");
		sell=input.nextDouble();
		
		if (sell>cost) {
			System.out.println("you've got a profit of "+(sell-cost)+"rs");
		}//end if
		else if (sell==cost) {
			System.out.println("you've got a profit of 0 rs");
		}//end else if
		else {
			System.out.println("you are in loss of"+(cost-sell)+"rs");
		}
	}// end main
}// end class
