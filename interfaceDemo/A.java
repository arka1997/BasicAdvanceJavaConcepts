package interfaceDemo;

public interface A {
	static int x=676;
	int y=787;
	final static int z=10;
	final int g = 15;
	public void test();
	default void tst() {
		System.out.println( A.y);
	}
//	xx = 20;//error, we cannot modify interface value once declared as they are static and final by default
}
