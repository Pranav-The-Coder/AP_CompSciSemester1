/*
 *	Author:  Pranav
 *  Date: DEc 5th
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		
		
	}

	public String reversewords(String sentence) {
		String reversed = ""; 
		int length = sentence.length(); 

		for (int i = sentence.length() - 1; i >= 0; i--) {
			
			if (sentence.substring(i, i + 1).equals(" ")) {
				String word = sentence.substring(i + 1, length);
				reversed = reversed + word + " "; 
				length = i; 
			}
		}

		reversed = reversed + sentence.substring(0, length);

		return reversed;
	}
}
