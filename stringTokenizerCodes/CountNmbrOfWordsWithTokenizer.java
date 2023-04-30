package stringTokenizerCodes;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountNmbrOfWordsWithTokenizer {

	//Here's a program to count the number of words in a given String using String Tokenizer. And also print the words independently without spaces one by one from the String.
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the STRING");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer s = new StringTokenizer(str);
		while(s.hasMoreTokens()) {
			count++;
			System.out.println(s.nextToken());
		}
		System.out.println("Number of words in abaove String are: "+count);
	}

}
