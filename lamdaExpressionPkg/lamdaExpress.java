package lamdaExpressionPkg;

public class lamdaExpress implements InterfaceLamda{
	
	@Override
	public void test() {
		
	}
	public static void main(String[]args) {
	InterfaceLamda i1 = ()->{
			System.out.println(100);
		};
		i1.test();
		i1.test2(100);	
		i1.test3(1000);
//		i1.test5();
//		A.test5();
	}
public static void test5() {
	System.out.println(100);
}
	
}
