package lamdaExpressionPkg;
@FunctionalInterface
public interface InterfaceLamda {
	int id = 25;
	public void test();
	default void test2(int x) {
		System.out.println(x);
	}
	default void test3(int x) {
		System.out.println(x);
	}
	public static void test5() {
		
	}
}
