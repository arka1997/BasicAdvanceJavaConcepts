package formvalidationsWithRegularExpression;

import java.util.Scanner;

public class EasyAdvancedNameValidation2 {

	public static void main(String[] args) {
		// 
		System.out.println("Enter valid name");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String regex = "[a-zA-Z]+\\.+\\s.?";
		String[] split = str.split("\\s+");
		System.out.println(split.length);
		if(str.matches(regex)&& str.length()>2 ) {
			System.out.println(" valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
