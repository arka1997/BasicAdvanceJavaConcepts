package loop;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		for(int i = 0; i<4; i++) {
			x: if(i==2) {
				break x;
			}
		System.out.println(i);
		}
	}

}
