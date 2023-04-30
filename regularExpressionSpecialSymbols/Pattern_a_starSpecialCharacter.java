package regularExpressionSpecialSymbols;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_a_starSpecialCharacter {
	//writting "a*" means it gives us 0 occurences of "a" or group of occurences of "a", of a parrticular character which is written with "*" in Regular Expression.
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*");
		Matcher m = p.matcher("aabaaacadaaaah");//1st String
		
		while(m.find()) {
			System.out.println(m.start()+"....."+m.group());
		}
	}
//	OUTPUT
//	0.....aa
//	2.....    //Here we get the zero occurrence also for a character which is not "a". In real-Life, "a*" donates to everybody, whether the character belongs to poor class or rich class.
//	3.....aaa
//	6.....
//	7.....a
//	8.....
//	9.....aaaa
//	13.....
//	14.....

}
