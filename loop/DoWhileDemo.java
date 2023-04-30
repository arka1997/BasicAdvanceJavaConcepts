package loop;
import java.util.Scanner;
public class DoWhileDemo {

	public static void main(String[] args) {
		Boolean[] bol = new Boolean[3];
		Scanner sc = new Scanner(System.in);
		String condition = "yes";
		//In do while loop at first the lines of code int the do block gets executed first, then condition is checked, but if condition is false then loop gets terminated
		do {
			System.out.println("ENTER THE AMOUNT TO BE FETCHED just one time");
			int amnt = sc.nextInt();
			System.out.println("fetched"+" "+amnt+" "+"Rupees");
			System.out.println("Do you want to continue(yes/no)");
			condition = sc.next();
		}
		while(condition.equals("no"));
	}

}
