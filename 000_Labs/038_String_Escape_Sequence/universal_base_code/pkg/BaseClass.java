/*
 *	Author:  Pranav A
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your pet peeve.");
		this.petPeeve = sc.nextLine();
	}
	public String Petpeeve() {
		return petPeeve;
	}
}


