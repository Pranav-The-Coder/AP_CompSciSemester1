/*
 * Author:  Pranav 
 * Date:  November 20th
 */

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
    	// Your code goes below here
    	
    	
        BaseClass test = new BaseClass();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Give some word");
        String word = sc.nextLine();
        test.wordy(word);

        sc.close();
    }
}
