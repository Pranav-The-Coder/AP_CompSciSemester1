/*
 *	Author: Pranav A
 *  Date: Oct 24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        Dog firstdog = new Dog("Pranav");
        firstdog.setAge(4);

        Dog seconddog = new Dog("Bobby", "poodle");

        if (firstdog.isSleeping()) {
            System.out.println(firstdog.getName() + " is asleep.");
        } 
        else {
            firstdog.bark();
        }

        if (seconddog.isSleeping()) {
            if (!firstdog.isSleeping()) {
                seconddog.bark();
            }
            else {
            	System.out.println(seconddog.getName() + " is asleep.");
            }
        } 
        else {
            if (!firstdog.isSleeping()) {
                seconddog.bark();
            }
        	else {
            	seconddog.bark();
            }
        }
    }
}


