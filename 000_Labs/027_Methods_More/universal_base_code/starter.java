/*
 *	Author: Pranav A
 *  Date: October 23rd
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        System.out.println("Setting all values:");
        MyCharacter myCharacter = new MyCharacter(); 
        if (myCharacter.setAll("Rogue", -5, 0, -5, 5)) {
            System.out.println("All values set successfully.");
        } else {
            System.out.println("Setting values didn't work.");
        }
        myCharacter.myToString();
    }
}
