package regularExpressionSpecialSymbols;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_a_QuestionMarkSpecialCharacter {

	public static void main(String[] args) {
		// 
		Pattern p = Pattern.compile("a?");//here "a?" will print for all the occurences(both "a" and those characters excluding "a") of characters, independently and not in a group, whether it's "a" or not a.
		Matcher m = p.matcher("aabaaacadaaaah");//1st String
		
		while(m.find()) {
			System.out.println(m.start()+"....."+m.group());
		}
	}
//OUTPUT:-
//0.....a
//1.....a
//2.....
//3.....a
//4.....a
//5.....a
//6.....
//7.....a
//8.....
//9.....a
//10....a
//11....a
//12....a
//13....
//14....
}
