/*
 *	Author: Pranav A 
 *  Date: Nov 6
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        BaseClass test = new BaseClass();

        test.fill();

        System.out.println("Number of elments: " + test.getNumbers().length);
        System.out.println(" Array vlues: ");
        test.print();

        int min = test.min();
        int max = test.max();
        double average = test.avg();

        System.out.print(" Minimum value: " + min);
        System.out.print(" Maximam value: " + max);
        System.out.print(" Average value: " + average);
    }
}
