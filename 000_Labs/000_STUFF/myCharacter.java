/*
 *	Author:  Pranav Arunachalam
 *  Date: October 17th
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
    String role;

    public myCharacter() {
        role = "No Role";
    }

    public myCharacter(String newRole) {
        if (newRole.equals("Wizard") || newRole.equals("Warrior") || newRole.equals("Rogue") || newRole.equals("wizard") || newRole.equals("warrior") || newRole.equals("rogue")) {
            role = newRole;
            System.out.println("Nice, You chose " + role + "!");
        } else {
            role = "No Role ";
            System.out.println("Not a correct role. Setting to No role.");
        }
    }

    public void displayRole() {
        System.out.println("Role: " + role);
    }
}





