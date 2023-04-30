package threadCodes;

public class BalanceModuleThreadDrawback extends Thread{
	int x = 100;
	String y;
	BalanceModuleThreadDrawback(String str){
		y=str;
	}
	public void run() {
		
		if(y.equals("add")) {
			for(int i=0;i<1000;i++) {
			x+=10;
			System.out.println(x);
			}
		}
		if(y.equals("sub")) {
			for(int i=0;i<1000;i++) {
			x -= 10;
			System.out.println(x);
		}
		}
	}
	public static void main(String[] args) {
		BalanceModuleThreadDrawback b1 = new BalanceModuleThreadDrawback("add");
		b1.start();
		BalanceModuleThreadDrawback b2 = new BalanceModuleThreadDrawback("sub");
		b2.start();
	}

}
