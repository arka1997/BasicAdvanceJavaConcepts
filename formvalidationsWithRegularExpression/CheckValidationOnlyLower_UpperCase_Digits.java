package formvalidationsWithRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidationOnlyLower_UpperCase_Digits {
	
	//VALIDATE or check a string for Special characters. If it contains special characters & spaces, then show ERROR. If not, then accept the input. 
	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("[\\W]");// "\\W” will return everything except “Lowercase”, “Uppercase” and “Digits”, and if there are any special characters, then m.find will return true, and count is incremented by 1, then count>0 means error, as we will know that string has special characters in it  
		
		Matcher m = p.matcher("D3AnJ1");//String 1, its a string free from "special characters & spaces". So it will be accepted.
		Matcher m2 = p.matcher("D3@An J1");//String 2
		
		//Validating first String
		while(m.find()) {
			count++;
		}
		if(count!=0) {//here count will be zero, as 1st string has no special characters & spaces.So, no ERROR
			System.out.println("ERROR! remove special characters & spaces from the Input");
		}
		else {
			System.out.println(" Input Accepted for the 1st String");
		}
		
		//Validating Second String
		while(m2.find()) {
			count++;
		}
		if(count!=0) {//here, count> 0, as 2nd string has special characters & spaces.so ERROR!.
			System.out.println("ERROR! remove special characters & spaces from the Input");
		}
		else {
			System.out.println(" Input Accepted for the 2nd String");
		}
	}

}
