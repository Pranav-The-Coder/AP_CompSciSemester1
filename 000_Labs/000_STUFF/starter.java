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
        System.out.println("Please enter yo ur first name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name);
        System.out.println("Please enter your age in digits:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println(name + " is " + age);
        System.out.println("Please enter your birthday month: ");
        String bmonth = sc.nextLine();
        System.out.println(name + " is " + age + " and was born in " + bmonth);
        System.out.println("Please enter your birthday year:");
        int byear = sc.nextInt();
        sc.nextLine();
        System.out.println(name + " is " + age + " and was born in " + bmonth + " on " + byear);
    	System.out.println("How much is a bucky fifty");
        String answer = sc.nextLine();
        System.out.println("A buck fifty is " + answer);
        
		
	}
}
