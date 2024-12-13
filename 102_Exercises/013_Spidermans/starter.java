/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman test = new Spiderman("Bob");
		test.setAge(32);
		test.setVillian("Joe");
		Spiderman two = new Spiderman("Tobey Maguire", 49, "Green Goblin");
		
		Spiderman three = new Spiderman("Andrew Garfild", 41);
		three.setVillian("Electro");
		
		System.out.println("The villian is " + three.getVillian());
		
	}
}
