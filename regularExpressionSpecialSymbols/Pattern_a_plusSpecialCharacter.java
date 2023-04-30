package regularExpressionSpecialSymbols;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_a_plusSpecialCharacter {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a+");//here "a+" will print only for the occurence of it's own type and NOT for Zero occurence. Its shelfish, so doesnot donates to the other characters except itself.
		Matcher m = p.matcher("aabaaacadaaaah");//1st String
		
		while(m.find()) {
			System.out.println(m.start()+"....."+m.group());
		}
	}
//OUTPUT:-
//	0.....aa
//	3.....aaa
//	7.....a
//	9.....aaaa

}
