/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name);
        
        
       
        System.out.println("Please give a number:");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Please give another number:");
        int number2 = sc.nextInt();
        sc.nextLine();
        int sum = (number + number2);
        System.out.println("The sum of these numbers is " + sum);
        
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();
        
        
        
        
        
	}
}