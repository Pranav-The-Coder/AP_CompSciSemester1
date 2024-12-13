/*
 *	Author:Pranav Arunachalam
 *  Date: OCtober 4th
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        int money = 100;
        System.out.println("Slot Machine Rules:");
        System.out.println("1. Each player starts with $100.");
        System.out.println("2. Input a wager less than your total amount of money.");
        System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("   a. If two numbers match, you double your money.");
        System.out.println("   b. If three numbers match, you triple your money.");
        System.out.println("   c. If none match, you lose your money."); 

        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
        String start = sc.nextLine();
        
        while (true) {
            if (start.equals("Yes") || start.equals("yes") || start.equals("y") || start.equals("Y")) {
                break;
            } 
            else if (start.equals("No") || start.equals("no") || start.equals("N") || start.equals("n")) {
                System.out.print("Sad to see you go! You still have $" +  money + " left. Come again soon! Thanks!");
                System.exit(0);
            } 
            else {
                System.out.println("That wasn't quite the correct answer. Try again.");
                start = sc.nextLine();
            }
        }

        while (money > 0) {
            System.out.println("You have $" + money + ". How much would you like to wager?");
            int wager = sc.nextInt();
            
            if (wager > money) {
                System.out.println("You only have $" + money + "! Please enter a smaller number.");
            } else if (wager <= 0) {
                System.out.println("Sneaky! No negatives or 0!");
            } else {
                int a = (int)(Math.random() * 10) + 1;
                int b = (int)(Math.random() * 10) + 1;
                int c = (int)(Math.random() * 10) + 1;

                System.out.println("Your rolls are: ");
                System.out.println("| " + a + " | " + b + " | " + c + " | ");

                if (a == b && b == c) {
                    System.out.println("Wow, you are lucky! All three numbers match! You tripled your wager!");
                    money += wager * 2;
                } 
                else if (a == b || b == c || a == c) {
                    System.out.println("You won! You're wager has now been doubled!");
                    money += wager;
                } 
                else {
                    System.out.println("Didn't win this time, better luck next time!");
                    money -= wager;
                }

                System.out.println("You have $" + money + ".");

                if (money <= 0) {
                    System.out.println("You have no money left! Game over.");
                    break;
                }

                System.out.print("Would you like to try the slots again? (Yes/yes/Y/y) : ");
                sc.nextLine();
                start = sc.nextLine();

                if (start.equals("No") || start.equals("no") || start.equals("N") || start.equals("n")) {
                    System.out.print("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
                    break;
                }
            }
        }
    }
}
