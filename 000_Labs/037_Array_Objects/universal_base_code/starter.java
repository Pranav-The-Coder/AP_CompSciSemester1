/*
 *	Author:  Pranav A
 *  Date: Nov 13
*/

import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
    	
    	
        Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];

        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior" + (i + 1));
            wizards[i] = new Wizard("Wizard" + (i + 1));
        }

        int warriorindex = 0;
        int wizardindex = 0;

        while (warriorindex < 100 && wizardindex < 100) {
        	
            if (!wizards[wizardindex].isDead()) {
                warriors[warriorindex].attack(wizards[wizardindex]);
            } 
            else {
                wizardindex++;
            }

            if (!warriors[warriorindex].isDead()) {
                wizards[wizardindex].attack(warriors[warriorindex]);
            } 
            else {
                warriorindex++;
            }
        }

        if (warriorindex == 100) {
            System.out.println("the Wizards wiin");
            
            System.out.println("wizards remaining: " + (100 - wizardindex));
        } 
        else {
            System.out.println("the Warriors win");
            System.out.println("Warriors remaining: " + (100 - warriorindex));
            
            
        }
    }
}
