/*
 *	Author:  Pranav
 *  Date: Sep 18
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();
		System.out.print("Enter another number");
		int num2 = sc.nextInt();
		
		
		if(num != num2)
			System.out.println("The numbers are not the same, they are diferent.");
		else if(num == num2)
			System.out.println("The numbers are the same.");
	}
}
