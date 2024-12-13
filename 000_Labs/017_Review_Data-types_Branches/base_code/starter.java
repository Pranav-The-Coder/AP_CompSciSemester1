
/*
 *	Author: Pranav Arunachalam
 *  Date: Sep 25
*/
import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your characters name");
		
		String name = sc.nextLine();
		System.out.print("What is your characters title");
		
		String title = sc.nextLine(); 
		 
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
		System.out.println("You have 20 points and the following traits with a maximum of 10 points each. Strength - Buff and able to carry larger items, Dexterity - Agile and moves quick, Intelligence - Better at magic spells! Charisma - How personable ");
		System.out.println("How many points for Stength");
		int strength = sc.nextInt();
		if(strength > 10) {
			System.out.println("Over 10! Try Again! How many points for Stength");
			strength = sc.nextInt();
		}
		
		System.out.println((20-strength) + "points left.");
		System.out.println("How many points for Dexterity");
		int dex = sc.nextInt();
		if(dex > 10 || dex > (20 - (strength + dex))) {
			System.out.println("Over 10 or over budget! Try Again! How many points for dexterity");
			dex = sc.nextInt();
		}
		System.out.println((20-(strength + dex)) + "points left.");
		System.out.println("How many points for Intelligince");
		int inte = sc.nextInt();
		if(inte > 10 || inte > (20 - (strength + dex + inte) )) {
			System.out.println("Over 10 or over budget! Try Again! How many points for Intelligince");
			inte = sc.nextInt();
		}
		System.out.println((20-(strength + dex + inte)) + "points left.");
		
		System.out.println("How many points for Charisma");
		int charisma = sc.nextInt();
		if(charisma > 10 || inte > (20 - (strength + dex + inte + charisma))) {
			System.out.println("Over 10 or over budget! Try Again! How many points for charisma");
			charisma = sc.nextInt();
	
		}
		System.out.println((20-(strength + dex + inte + charisma)) + "points left.");
		System.out.println(title + " " + name + " has " + strength + " points in Strength, "  + dex + " points in Dexterity, " + inte + " points in Intelligence, "+ charisma + " points in Charisma, and "+ (20 - (strength + dex + inte + charisma)) + " points left over!");
	}
}