/*
 *	Author:  
 *  Date: 
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
		System.out.print("Enter a last number"); 
		int num3 = sc.nextInt();
		if((num > num2) && (num > num3))
			System.out.print(num + " is the biggest and ");
		else if((num2 > num) && (num2 > num3))
			System.out.print(num2 + " is the biggest and ");
		else if ((num3 > num2) && (num3 > num))
			System.out.print(num3 + " is the biggest and ");
		if((num < num2) && (num < num3))
			System.out.print(num + " is the smallest ");
		else if((num2 < num) && (num2 < num3))
			System.out.print(num2 + " is the smallest ");
		else if ((num3 < num2) && (num3 < num))
			System.out.print(num3 + " is the smallest ");
		
		
	}
}
