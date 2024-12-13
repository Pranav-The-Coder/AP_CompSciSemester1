/*
 * Author:  Pranav A
 * Date:  Nov 20
 */

package pkg;
import java.util.Scanner;
import java.util.Random;

public class BaseClass {
	int example = 0;
	
    public BaseClass() {
    }

    public void wordy(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i, i + 1));
        }
    }
}
