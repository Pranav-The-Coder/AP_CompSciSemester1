/*
 *	Author:Pranav Arunachalam
 *  Date: October 13
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
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
