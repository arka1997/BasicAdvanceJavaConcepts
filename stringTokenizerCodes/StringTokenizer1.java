package stringTokenizerCodes;

import java.util.StringTokenizer;

public class StringTokenizer1 {
//This below code splits a big String into Tokens whenever defined delimiters are found in String.And then printing each word of the String separately.
	
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Debanjan Sarkar Academy");//when we pass no arguments except the "String" inside "StringTokenizer()" Constructor, then by default,
																		//String Tokenizer splits the string into tokens considering the (space)" " to be delimiters, and splitting it whenever (space)" " is found.It returns an address of an object containing the splitted Tokens
		System.out.println(str);//prints memory address, @372f7a8d
		while(str.hasMoreTokens()) {//"str.hasMoreTokens()" checks in "str" reference if it has any tokens, if present, then points to the first Token, and returns true.
			//now while loop will run until ".hasMoreTokens" is returning "true". After the last Token is reached, it will return false.
			System.out.println(str.nextToken());//everytime ".hasMoreToken()" founds a Token and returns true for 3 times(according to given string), then ".nextToken()" also reads that Token 3 times, when while loop is true, and prints the Tokens.
		}
		
//If we don't use while loop, then to print the 3 splitted tokens from the String, we have to write ".nextToken" 3 times.This is lengthy process. So we use while loop, and everytime we found a token we return true, and we write str.nextToken() only once inside loop and print those Tokens one by one.
//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
	}

}
