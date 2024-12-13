/*
 *	Author: Pranav A.
 *  Date: OCt 2
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = sc.nextLine();
        
        System.out.println("Please enter how many times you want it to be outputed: ");
        int number = sc.nextInt();
        int num = 0;
        while(num < number)
		{
			System.out.println(name);
		
		    
		    num = num + 1;
		}
		    
        



		
	}
}
