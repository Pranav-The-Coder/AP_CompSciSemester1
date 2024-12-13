/*
 *	Author:  Pranav  A
 *  Date: Nov 6th
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class BaseClass {
    int[] numbers;

    public BaseClass() {
        numbers = new int[10];
    }

    public void fill() {
        numbers[0] = 12;
        numbers[1] = 45;
        numbers[2] = 32;
        numbers[3] = 7;
        numbers[4] = 29;
        numbers[5] = 51;
        numbers[6] = 8;
        numbers[7] = 19;
        numbers[8] = 35;
        numbers[9] = 25;
    }

    public int min() {
        int min = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }
        return min;
    }

    public int max() {
        int max = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }
        return max;
    }

    public double avg() {
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        return (double) sum / numbers.length;
    }

    public void print() {
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
    }

    public int[] getNumbers() {
        return numbers;  
    }
}
