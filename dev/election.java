package dev;
import java.util.*;
public class election {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age  , eligableage;
		System.out.println("enter your age");
		eligableage=18;
		age=sc.nextInt();
		
			if(eligableage<=age)
			{
			System.out.println("you are eligable");
			}
			else 	
			{
			System.out.println("sorry you are not eligable");
			}
		}
		}
