package formvalidationsWithRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckWithNoWhiteSpaceValidation {
	//Code for Validating or Checking if White Space is their or not.If present, then error.
	public static void main(String[] args) {
		System.out.println("Enter value for checking Space validation in our Input if any");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		Pattern p = Pattern.compile("[\\s]");// 
		Matcher m = p.matcher(s);
		
		while(m.find()) {//now we know, find() will only be true, if the contents of Regular Expression is present in our given string. Multiple Occurences of space is also allowed
			count++;//if space is found then it will increment the count
		}
		if(count!=0) {//if count>0, then there are space in out input,
			System.out.println("ERROR! remove white Spaces from the Input");
		}
		else {
			System.out.println(" Input Accepted");
		}
	}

}
