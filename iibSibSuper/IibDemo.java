package iibSibSuper;

public class IibDemo {
	final int x;
	static int y;
	{
		x=10;
		y=20;
		int z=x+y;
		System.out.println(z);
	}
	static {
		System.out.println(y);
	}
	public static void main(String[] args) {
		IibDemo i1 = new IibDemo();
		
	}

}
