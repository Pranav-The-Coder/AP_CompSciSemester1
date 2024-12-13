/*
 *	Author: Pranav Arunachalam
 *  Date: October 17th
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
    	// Your code goes below here
        Scanner sc = new Scanner(System.in);

        myCharacter character1 = new myCharacter();
        character1.displayRole();

        System.out.println("Enter your role (Wizard, Warrior, Rogue): ");
        String userRole = sc.nextLine();

        myCharacter character2 = new myCharacter(userRole);
        character2.displayRole();

        sc.close();
    }
}
