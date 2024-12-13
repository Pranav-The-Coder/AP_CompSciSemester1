/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int randomnum = (int)(Math.random()*999)+1;
		System.out.print("Guess a number from 1 to 1000 in order to find my random number");
		int num = sc.nextInt();
		if(num == randomnum)
			System.out.print("You got the number right! WOW!!!!");
		if(num != randomnum)
			System.out.print("Nice try maybe next time, you might have been close or might have not. You will never ever know.");
	}
}
