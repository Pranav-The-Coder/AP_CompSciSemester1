/*
	Author: Pranav A
	Date: Dec 6
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word");
		String sentence = sc.nextLine();
		
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				break;
			}
			int space = sentence.indexOf("");
			String word = sentence.substring(0,space);
			System.out.print(spongCase(word));
			
			
			sentence = sentence.substring(space+1);
		}
	
		System.out.print(newWord);
	}
	public static String spongCase(String word){
		String newWord = "";
		int index = 0;
		for (int i = 0; i < word.length(); i++){
			if(word.substring(i,i+1).equals(" ")){
				newWord += " ";
				index = 0;
			}
			else{
				if(i%2 == 1){
					newWord += word.substring(i,i+1).toUpperCase();
				}
				else{
				newWord += word.substring(i,i+1).toLowerCase();
				}
				index++;
			}
			return newWord;
			
			
		}  
	}
}
