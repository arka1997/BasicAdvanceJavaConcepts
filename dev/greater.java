package dev;
//3 no greater
import java.util.*;
public class greater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x ,y,z;
		System.out.println("enter the 1st number");
		x = sc.nextInt();
		System.out.println("enter the 2nd number");
		y=  sc.nextInt();
		System.out.println("enter the 3rd number");
		z= sc.nextInt();
		
		if(x>y)
		{
			if(x>z) {
			 System.out.println(x+"is greater");	 
		}
		 	else
		 		{
		 	System.out.println(z+"is greater");	
			 
		}
		 
		}
			else
			if (y>z)
			 {
				System.out.println(y+"is greater");
				}
			else
			{
				System.out.println(z+ "is greater" );
			}
		
				
		
		
		
	}

}
