package com.Assignment.basic;

import java.util.Scanner;

public class Q10_PowerOfNumber {
	   public static void main(String[] args) {
	        int x,y;
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter the base value");
	        x=input.nextInt();
	        System.out.println("Enter the exponent value");
	        y=input.nextInt();
	        System.out.println( "the value of X^Y is: "+ExponentialValue(x,y));;
	    }//end main
	    public static int ExponentialValue(int x, int y){
	        int z=1;
	        for (int i=1;i<=y;i++){
	            z*=x;
	        }//end for
	        return z;
	    }//end power
}
