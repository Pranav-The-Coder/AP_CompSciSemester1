/* 
    Lecture note example - If Statements

*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("The Earth is starting its path on spliting in half causing chaos!");
        System.out.println("What way would you want the Earth to split in two?");
        System.out.println("1.The Ancient Artifact: Deep beneath the Earth, a long-forgotten artifact awakens after centuries of dormancy. Its power causes a cataclysmic rift, splitting the planet in two and unleashing ancient forces!");
        System.out.println("2.The Scientific Experiment: A group of ambitious scientists attempts a groundbreaking experiment to harness unlimited energy from the Earth's core. An unexpected reaction leads to a catastrophic chain reaction, fracturing the planet.");
        System.out.println("3.The Celestial Alignment: A rare cosmic event aligns the planets in a way that disrupts the Earth’s gravitational balance. This celestial anomaly creates a massive fissure, cleaving the world apart and sending shockwaves throughout the solar system.");
        
        int answer = sc.nextInt();
        if(answer == 1){
            System.out.print("A team of archaeologists discovers a glowing crystal inside an ancient temple in the Amazon. When one touches it, a surge of energy erupts, shaking the ground and splitting the Earth open, swallowing the temple and jungle.");
            System.out.print("1.Investigate the glowing crystal to understand its origins and power")
            System.out.print("2.Collect samples of the surrounding soil and plants to study any unusual changes.")
        
        }
        else if(answer == 2){
            System.out.print("In a lab, Dr. Elena Voss prepares to activate a geothermal reactor to harness core energy. As they start the experiment, alarms blare and the machinery fails, resulting in a powerful explosion that splits the ground and destroys the facility.");
            
        
        }
        
        else if(answer ==3){
            System.out.print("Astronomers at an observatory witness a rare planetary alignment. Suddenly, the ground shakes violently, and a deep rumble announces the Earth fracturing, creating a massive rift across the landscape.");
            
        
        }
        else{
        }
	}
}