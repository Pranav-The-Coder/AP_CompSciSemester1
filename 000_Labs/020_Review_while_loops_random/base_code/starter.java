/*
 *	Author:  Pranav Arunachalam
 *  Date: OCt 2
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int secret = (int)(Math.random() * 1000);
		
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Guess a number from 0 to 1000");
		
			int guess = sc.nextInt();
			if(guess==secret)
		    {
		    	break;
		    }
		}
		    
		    
		System.out.print("You gussed the number!");
		    


		
	}
}
