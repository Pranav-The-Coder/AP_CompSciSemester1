/*
 *	Author: Pranav A
 *  Date: Dec 5
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		System.out.println("give a word ");
		String phrase = sc.nextLine();

		System.out.println(test.reversewords(phrase));
	}
}
