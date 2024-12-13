
/*
 *	Author:  
 *  Date: 
*/
import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose Your Role: Wizard, Warrior, or Rogue: ");
		
		String role = sc.nextLine();
		
		if(role.equals("Wizard"))
			System.out.println("You have chosen: " + role);
		else if(role.equals("wizard"))
			System.out.println("You have chosen: " + role);
		else if(role.equals("Warrior"))
			System.out.println("You have chosen: " + role);
		else if(role.equals("warrior"))
			System.out.println("You have chosen: " + role);
		else if(role.equals("Rogue"))
			System.out.println("You have chosen: " + role);
		else if(role.equals("rogue"))
			System.out.println("You have chosen: " + role);
		else{
			System.out.println("You have not chosen a correct role");
		}
	}
}