package loop;
import java.util.Scanner;
public class LoopPin2 {
	public static void main(String[] args) {
		int pin = 1234;
		//Here we use for loop as its same for every user, 3 attempts is fixed, after thst eeryones card will be blocked
		//In one word, if the repeatations are same for every user, then we use for loop
		for(int i=0;i<4;i++) {
			Scanner sc = new Scanner (System.in);
			int userinput = sc.nextInt();
			if(i==3) {
				System.out.println("Card is blocked");
				break;
			}
			if(pin == userinput) {
				System.out.println("Correct pin");
			}
			else {
				System.out.println("Incorrect Pin");
			}
		}
	}

}
