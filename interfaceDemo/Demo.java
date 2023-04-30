package interfaceDemo;

import java.util.Scanner;

class Demo{
	static String bb;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String n=sc.next();
		char[] x = n.toCharArray(); 
		char temp = 'a';
		for(int j=0;j<n.length();j++) {
		for(int i=0;i<n.length()-1;i++) {
			if(x[i]> x[i+1]) {
				temp=x[i];
				x[i] = x[i+1];
				x[i+1] = temp;
			}
		}
		
		}
//		aaiknn
		int p1;
		int p2;
		for(int i=0;i<x.length-1;i++) {
			p1 = i;
			p2 = i+1;
			if(x[p1]==x[p2]) {
				p1++;
				p2++;
			}
			else {
				bb += x[p1];
				p1++;
				//p2++;
			}
		}
		System.out.println(bb);
}
}

