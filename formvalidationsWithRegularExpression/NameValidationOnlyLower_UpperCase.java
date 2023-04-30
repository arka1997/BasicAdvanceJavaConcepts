package formvalidationsWithRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidationOnlyLower_UpperCase {
//For Doing Name Validation in Backend, we check a string if it contains only LowerCase or UpperCase letter alphabets and can have SPACES too fro Full Name, otherwise shows ERROR.
	
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter an Input for Name validation ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Pattern p = Pattern.compile("[^a-zA-Z\\s]");// if we want to take  LowerCase or UpperCase alphabets only, then inside Regular, we put "^a-zA-Z" because, if our string has special characters, then ^a-zA-Z means to include everything except LowerCase or UpperCase alphabets.
											  //So, m.find() will be true if special characters are found in our string and it will increment the value of count.
 											  //Now, once value of count is increased, we will get to know that there are special characters in it, so we will show error, if count>0, which means it has special characters.
		Matcher m = p.matcher(s);//1st String
		
		//Validating 1st String
		while(m.find() || s.length()<3) {//now we know, find() will only be true, if the contents of Regular Expression is present in our given string.And if true, enters loop->increments count
			count++;//if other characters except alphabets are found then it will increment the count.
		}
		if(count!=0) {//if count>0, then there are special characters also in out input string,so will show error, As we need only alphabets and spaces too.
			System.out.println("ERROR! Only LowerCase and Uppercase are allowed");
		}
		else {
			System.out.println(" Input Accepted");
		}
		
	}

}
