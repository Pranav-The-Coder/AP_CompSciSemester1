/*
 * Author: Pranav Arunachalam
 * Date: Nov 7th
 * Collaborator(s): 
*/

import java.util.*;

class starter {
    public static void main(String args[]) {
        int[] numbers = new int[20];
        Random rand = new Random();

        int i = 0;
        while (i < numbers.length) {
            numbers[i] = rand.nextInt(10) + 1;
            i++;
        }

        int target = rand.nextInt(10) + 1;
        System.out.println("Target: " + target);

        int count = 0;
        System.out.print("Indexs: ");
        i = 0;
        while (i < numbers.length) {
            if (numbers[i] == target) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
       
        System.out.println("count: " + count);

        
        i = 0;
        while (i < numbers.length - 1) {
            if (numbers[i] == numbers[i + 1]) {
                System.out.println("Consecutive: ");
                System.out.println("Indexes: " + i + " and " + (i + 1) + " - Numbr: " + numbers[i]);
            }
            i++;
        }
    }
}

