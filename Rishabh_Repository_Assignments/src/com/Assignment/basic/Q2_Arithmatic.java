package com.Assignment.basic;

import java.util.Scanner;

public class Q2_Arithmatic {

	public static void main(String[] args) {
		int a ,b;
		Scanner input= new Scanner(System.in);
		System.out.println("ENter two numbers two perform all arithmatic operations");
		a= input.nextInt();
		b=input.nextInt();
		
		System.out.println("The Addition of two numbers is: "+ (a+b));
		System.out.println("The Subtraction of two numbers is: "+ (a-b));
		System.out.println("The Multiplications of two numbers is: "+ (a*b));
		System.out.println("The Division of two numbers is: "+ (a/b));
		

	}

}
