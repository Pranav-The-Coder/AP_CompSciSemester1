/*
 *	Author: Pranav Arunachalam 
 *  Date: Sep 25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
	
		int num = sc.nextInt();
		System.out.print("Enter another number");
		int num2 = sc.nextInt();
		if(num % 2 == 0)
			System.out.println(num + " is even");
		else{
			System.out.println(num + " is odd");
			
		}
		if(num2 % 2 == 0)
			System.out.println(num2 + " is even");
		else{
			System.out.println(num2 + " is odd");
		}
		if(num % 3 == 0)
			System.out.println(num + " is divisible by 3");
		if(num % 4 == 0)
			System.out.println(num + " is divisible by 4");
		if(num % 5 == 0)
			System.out.println(num + " is divisible by 5");
		if(num % 3 != 0 && num % 4 != 0 && num % 5 != 0) 
				System.out.println(num + " is not divisible by 3 4 or 5");
				
		else{
			
		}
		
		if(num2 % 3 == 0)
			System.out.println(num + " is divisible by 3");
		if(num2 % 4 == 0)
			System.out.println(num + " is divisible by 4");
		if(num2 % 5 == 0)
			System.out.println(num + " is divisible by 5");
		if(num2 % 3 != 0 && num2 % 4 != 0 && num2 % 5 != 0) 
				System.out.println(num2 + " is not divisible by 3 4 or 5");
				
		else{
			
		}
				
		

	}
}
