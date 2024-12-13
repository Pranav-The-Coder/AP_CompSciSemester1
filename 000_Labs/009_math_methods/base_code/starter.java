/*
 *	Author:  Pranav Arunachalam
 *  Date: Sep 12
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a = (13 - 6 * 11);
		int a2 = (30 % 7 * (-2));
	
		System.out.println("a = The max of the 2 equations is " + Math.max(a,a2));
		int b = (3 * 8 + 31 % 7);
		System.out.println("b = The square root of the equation is " + Math.sqrt(b));
		System.out.println("c = The power of the 2 equations is " + Math.pow((37/3),(35%21)));
		double dpow = Math.pow(2,(14%3));
		double dsqrt = Math.sqrt((2*6)); 
		System.out.print("d = The max of the 2 equations is " + Math.max(dpow,dsqrt));
		
	}
}
