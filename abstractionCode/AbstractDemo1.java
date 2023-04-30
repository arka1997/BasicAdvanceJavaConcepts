package abstractionCode;

public abstract class AbstractDemo1 {
	static int x;
	int y;
	final static int z=10;
	final int g = 15;
	AbstractDemo1(){
		x = 10;
	}
	public static void main(String[] args) {
		System.out.println(AbstractDemo1.x);
	}
	
}
