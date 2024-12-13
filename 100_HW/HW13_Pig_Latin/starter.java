/*
   * Author: Pranav A
   * Date: Dec 6
   * Collaborator(s):
*/

import java.util.*;

class starter {
    public static void main(String args[]) {
    	
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = sc.nextLine();

        while (true) {
            if (sentence.indexOf(" ") == -1) {
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            System.out.print(topiglatin(word) + " ");
            sentence = sentence.substring(space + 1);
        }

        System.out.print(topiglatin(sentence));
    }

    public static String topiglatin(String word) {
        String piglatin= "";
        String firstletter = word.substring(0, 1);
        if (firstletter.equals("a") || firstletter.equals("e") || firstletter.equals("i") || firstletter.equals("o") || firstletter.equals("u") || 
        	firstletter.equals("A") || firstletter.equals("E") || firstletter.equals("I") || firstletter.equals("O") || firstletter.equals("U")) {
            piglatin =word + "way";
        } 
        else {
            String secondletter = word.substring(1, 2);
            if (secondletter.equals("a") || secondletter.equals("e") || secondletter.equals("i") || secondletter.equals("o") || secondletter.equals("u") ||
                secondletter.equals("A") || secondletter.equals("E") || secondletter.equals("I") || secondletter.equals("O") || secondletter.equals("U")) {
                piglatin = word.substring(1) + firstletter + "ay";
            } 
            else {
                piglatin = word.substring(2) +word.substring(0, 2) +  "ay";
            }
        }

        return piglatin;
    }
}
