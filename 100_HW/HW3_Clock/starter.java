/*
 *	Author:Pranav Arunachalam
 *  Date: Sep 18th
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What day is it. 0 = Sunday, 1 = Mon, 2 = Tue, 3 = Wed, 4 = Thur, 5 = Fri, 6 = Sat");
		int day = sc.nextInt();
		if(day == 0)
			System.out.println("Wake Up At 10 AM!");
		else if(day == 6)
			System.out.println("Wake Up At 10 AM!");
		else if(day == 1)
			System.out.println("Wake Up At 7 AM!");
		else if(day == 2)
			System.out.println("Wake Up At 7 AM!");
		else if(day == 3)
			System.out.println("Wake Up At 7 AM!");
		else if(day == 4)
			System.out.println("Wake Up At 7 AM!");
		else if(day == 5)
			System.out.println("Wake Up At 7 AM!");
		else {
		}
		
		
	}
}
