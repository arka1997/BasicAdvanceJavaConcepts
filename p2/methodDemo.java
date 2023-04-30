package p2;

public class methodDemo {
//	final int z; // shows error as final cannot be empty when its declared globally
	int z = 10;
	public static void main(String[] args) {
		int x = 10;
		final int y = 23;
		System.out.println(x);
		methodDemo m1 = new methodDemo();
		System.out.println(m1.z);
		m1.test();
	}
	public void test() {
		System.out.println("method is example");	
	}
}
