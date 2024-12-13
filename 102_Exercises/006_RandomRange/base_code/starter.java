/*
 *	Author: Pranav Arunachalam
 *  Date: Sep 16
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to crearte a range for your random number");
		System.out.println("Please enter a integer");
		int num = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first)");
		int num2 = sc.nextInt();
		int a = (num2-num);
		int b = (int)(Math.random()*a)+num;
		int c = (int)(Math.random()*a)+num;
		int d = (int)(Math.random()*a)+num;
		int e = (int)(Math.random()*a)+num;
		int f = (int)(Math.random()*a)+num;
		System.out.println("Your range is " + num + " to " + num2);
		System.out.println("Here are the 5 numbers genereated in that range");
		System.out.println(b + "," + c + "," + d + "," + e+ "," + f);
		
	}
}
