/*
 *	Author: Pranav
 *  Date: Sep 12
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = sc.nextInt();
		int follow = (number + 1);
		int follow1 = (number + 2);
		int follow2 = (number + 3);
		int follow3= (number + 4);
		int follow4 = (number + 5);
		int mul = (number * 1);
		int mul1 = (number * 2);
		int mul2 = (number * 3);
		int mul3 = (number * 4);
		int mul4 = (number * 5);
		System.out.println("Here are the next 5 integers");
		System.out.println(follow);
		System.out.println(follow1);
		System.out.println(follow2);
		System.out.println(follow3);
		System.out.println(follow4);
		System.out.println("Here are the next 5 multiples");
		System.out.println(mul);
		System.out.println(mul1);
		System.out.println(mul2);
		System.out.println(mul3);
		System.out.println(mul4);
		System.out.println("Here is " + number + " divided by 100");
		System.out.println(number/100.0);
		System.out.println("Here is " + number + " divided by 10");
		System.out.println(number/10.0);
		
	

	}
}
