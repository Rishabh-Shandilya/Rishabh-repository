package com.Assignment.Loops;

public class Question5 {
	public static void main(String[] args) {
		int n = 0;
		while (n <= 99) {
			++n;
			if (n % 2 != 0) {
				System.out.println(n);
			} // end if
			else {
				continue;
			} // end else

		} // end while
	}// end main
}// end class
