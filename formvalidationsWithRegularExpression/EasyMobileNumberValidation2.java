package formvalidationsWithRegularExpression;

import java.util.Scanner;

public class EasyMobileNumberValidation2 {
//Mobile phone Validator
	public static void main(String[] args) {
		System.out.println("Enter valid mobile number");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String regex = "[6-9][0-9]{9}";
		if(str.matches(regex)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
