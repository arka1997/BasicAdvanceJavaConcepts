package dev;

	import java.util.*;
	public class mark {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("GOOD LUCK");
			int physics , chemistry, mathematics , mark;
			System.out.println("enter your mark");
			mark=80;
			System.out.println("enter your physics number");
			physics= sc.nextInt();
			System.out.println("enter your chemistry number");
			chemistry=  sc.nextInt();
			System.out.println("enter your mathematics number");
			mathematics= sc.nextInt();
			
			if(mark<=physics)
			{
			if(mark<=chemistry)
			{
				if(mark<=mathematics)
				{
					System.out.println("congrats you are eligible");
				}
				else {
				System.out.println("you are not eligable for mathematics");	
				}
			}
			else {
				System.out.println("you are not eligable for chemistry");
			}
			}
			
			else
			{
				System.out.println("you are not eligable for physics");
			}
		}
	}
