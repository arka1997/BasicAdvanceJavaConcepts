package dev;
import java.util.Scanner;
public class ParkingDev {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int val = sc.nextInt();
	int sum = 10;
	if(val <= 2) {
		System.out.println("bb"+sum);
	}
	else {
	if(val > 2 ) {
		for(int i=2;i<5;i++) {
			sum+=10;
			System.out.println("cc"+sum);
		}
	}
	if(val > 5 ) {
		for(int i=5;i<8;i++) {
			sum+=20;
			System.out.println("dd"+sum);
		}
	}
		if(val > 8) {
			for(int i=8;i<val;i++) {
				sum+=30;
			}
		}
	}
	System.out.println(sum);
}
}
