package demo;

public class Demo2 extends Demo {
	Demo2(){
		super();
	}
	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		d1.test2();
	}
	private void test2() {
		super.test();
	}
}
