package loop;
import java.util.Scanner;
public class WhileLoopFetchMoney {

	public static void main(String[] args) {
		//USE OF WHILE LOOP, WHEN THE REPITATIONS ARE NOT SAME FOR EVERY USER
		//Example, if anyone wants to fetch cash from ATM, then he can fetch as many times, so the repitations are different
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to fetch money(YES/NO)");
		String s = sc.next();
		String condition = "yes";
		if(s.equals("yes")){
			while(condition.equals("yes")) {
				System.out.println("ENTER THE AMOUNT TO BE FETCHED");
				int amnt = sc.nextInt();
				System.out.println("fetched"+" "+amnt+" "+"Rupees");
				System.out.println("Do you want to continue(yes/no)");
				condition = sc.next();
				}
			}
		else {
			System.out.println("Thank you for your time...");
		}
		}
	}
