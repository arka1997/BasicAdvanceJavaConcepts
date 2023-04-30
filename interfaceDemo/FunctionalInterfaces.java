package interfaceDemo;
	@FunctionalInterface
	public interface FunctionalInterfaces {
		public void test();
		int xx = 10;
		default void xyz() {
			System.out.println(100);
		}
		default void xyzx() {
			System.out.println(100);
		}
		public static void test4() {
			System.out.println(400);
		}
		public static void main() {
			
		}
	}