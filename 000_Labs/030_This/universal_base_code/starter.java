/*
 *  Author:  Pranav A
 *  Date: Oct 28th.
 */

import pkg.*;
import java.util.Random;
import java.util.Scanner;


class starter {
	public static String randName() {
		int rand = (int)(Math.random() * 7);
		switch(rand) {
			case 0: return "Dopey";
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
			default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf dwarf1 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf dwarf2 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf dwarf3 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf dwarf4 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		
		PooleDwarf dwarf5 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf dwarf6 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf dwarf7 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);

		String firstname = dwarf1.getName();
		int duplicatecount = 0;

		if (firstname.equals(dwarf2.getName())) {
			duplicatecount++;
		}
		
		if (firstname.equals(dwarf3.getName())) {
			duplicatecount++;
			
		}
		
		if (firstname.equals(dwarf4.getName())) {
			duplicatecount++;
			
		}
		
		if (firstname.equals(dwarf5.getName())) {
			duplicatecount++;
			
		}
		
		if (firstname.equals(dwarf6.getName())) {
			duplicatecount++;
			
		}
		
		if (firstname.equals(dwarf7.getName())) {
			duplicatecount++;
		}

		System.out.println("There are " + duplicatecount + " duplicates of the name " + firstname);
	}
}
