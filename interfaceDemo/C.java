package interfaceDemo;

public class C implements A,B{
	@Override
	public void test() {
		System.out.println(111);
	}
	
	@Override
	public void test2() {
		System.out.println(234);
	}
	@Override
	public void test4() {
		System.out.println("in child class we can create child class object, but to fetch ");
	}
	public static void main(String[]args) {
		System.out.println(A.xx);
		B a1 = new C();
		a1.test4();
	}
}
