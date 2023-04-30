package stringTokenizerCodes;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitDateReturnOnlyYearWithTokenizer {

	//here we will be provided with a date like "20-09-2020", and we have to split the string using "-" as our delimiter, and return only year from that string.
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the STRING");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer s = new StringTokenizer(str,"-");//now inside StringTokenizer Constructor, we have another argument "-", which is a delimiter, to make compiler know, where to split the String.
						
		
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
			count++;
		}
		System.out.println(count);
	}

}
