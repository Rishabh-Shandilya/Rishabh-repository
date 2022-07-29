package com.Assignment.Loops;

public class Question4 {
	public static void main(String[] args) {
		int n=1;
		while(n<=100) {
			++n;
			if (n%2==0) {
				System.out.println(n);
			}//end if
			else {
				continue;
			}//end else
			
		}//end while
	}//end main
}//end class
