package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
//	  A(){
//		  System.out.println(100); 
//	  }
	//private int x = 10;
	

 public static void main() {
	 String[] array={"Java","Python","PHP","C++"};  
		System.out.println("Printing Array: "+Arrays.toString(array));  
		//Converting Array to List  
		List<String> list=new ArrayList<String>();//class Upcasting 
		for(String lang:array){  
		list.add(lang);  
		}  
}
 
}
