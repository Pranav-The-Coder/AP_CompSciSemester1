/*
 
Author: Pranav
Date: Oct 13
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
        // the command window when you compile and run this program.
		System.out.print("Input a number and we'll print out every prime until that number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		printPrimes(x);
	}

	public static boolean checkPrime(int x) {
		int num = 2;
		while (num < x) {
			if (x % num == 0) {
				return false;
			}
			num = num + 1;
		}
		return true;
	}

	public static void printPrimes(int x) {
		int num = 2;
		while (num < x) {
			if (checkPrime(num)) {
				System.out.println(num);
			}
			num = num + 1;
		}
	}
}
