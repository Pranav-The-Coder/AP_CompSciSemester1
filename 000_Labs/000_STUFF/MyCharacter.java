/*
 *	Author: Pranav A  
 *  Date: October 23rd
*/

package pkg;

import java.util.Scanner;
import java.util.Random;

public class MyCharacter {
    String role = "unknown role?";
    int strength = 0;
    int dexterity = 0;
    int intelligence = 0;
    int charisma = 0;

    public MyCharacter() {
        
    }

    public String setRole(String role) {
        if (role.equals("wizard") || role.equals("warrior") || role.equals("rogue")) {
            this.role = role;
        } else {
            this.role = "unknown role?";
        }
        return this.role;
    }

    public int setStrength(int strength) {
        if (strength < 0) {
            this.strength = 0;
        } else {
            this.strength = strength;
        }
        return this.strength;
    }

    public int setDexterity(int dexterity) {
        if (dexterity < 0) {
            this.dexterity = 0;
        } else {
            this.dexterity = dexterity;
        }
        return this.dexterity;
    }

    public int setIntelligence(int intelligence) {
        if (intelligence < 0) {
            this.intelligence = 0;
        } else {
            this.intelligence = intelligence;
        }
        return this.intelligence;
    }

    public int setCharisma(int charisma) {
        if (charisma < 0) {
            this.charisma = 0;
        } else {
            this.charisma = charisma;
        }
        return this.charisma;
    }

    public boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma) {
        setRole(role);
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setCharisma(charisma);
        return true; 
    }

    public void myToString() {
        System.out.println("Role: " + role);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
    }
}
