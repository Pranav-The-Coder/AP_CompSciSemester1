/*
 *	Author: Pranav A
 *  Date: October 18th
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        // Your code goes below here
        System.out.println("Please enter a message you want to decipher:");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.println();
        
        // Loop through each shift from 0 to 36
        for (int i = 0; i <= 36; i++) {
            String encodedmessage = Cipher.keyedEncode(message, i);
            System.out.println("Encoded message with shift " + i + ": " + encodedmessage);
        }
    }
}
