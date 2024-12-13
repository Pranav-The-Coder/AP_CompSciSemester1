import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        // CVMath.specialSquare(5);
        System.out.println(CVMath.findMid(2, 3, 1));
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many magic squares you want to see: ");
        int theinput = sc.nextInt();
        CVMath.specialSquare(theinput);
    }
}
