package formvalidationsWithRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

	public static void main(String[] args) {
		// here we will be validating our mobile number.Conditions are :- only digits will b preffered ii) phone number will start with 6/7/8/9.
		//So, in Regular Expression we will put, not equals to "[^0-9]".So, that, if our phone number has any other character except digits, then m.find() will return true, 
		//and count will be incremented.
		int count = 0;
		System.out.println("Enter an Input for Number validation ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		MobileNumberValidation m1 = new MobileNumberValidation();
		System.out.println(m1.validate(s));
		
		
		//Validating 1st String
		
	}
	public boolean validate(String str) {
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		
		Matcher m = p.matcher(str);//1st String
		return (m.find() && m.group().equals(str)); 
	}
	
//	OR we can have another way for validation//
//	try {
//		System.out.println("Enter an Input for Number validation ");
//		Scanner sc = new Scanner(System.in);
//		Long num = sc.nextLong();
//		String s = num.toString();
//		int count = 0;
//		Pattern p = Pattern.compile("[6-9][0-9]{9}");
//		
//		Matcher m = p.matcher(s);//1st String
//		while(m.find()) {//now we know, find() will only be true, if the contents of Regular Expression is present in our given string.And if true, enters loop->increments count
//			count++;//if other characters except alphabets are found then it will increment the count.
//		}
//		if(count!=0 ||s.length()<10) {//if count>0, then there are special characters also in out input string,so will show error, As we need only alphabets and spaces too.
//			System.out.println("ERROR! Only LowerCase and Uppercase are allowed");
//		}
//		else if(str.length()==10){
//
//	System.out.println(" Input Accepted");
//		}
//	}

}
