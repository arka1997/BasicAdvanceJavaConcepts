package ExceptionCode;

public class Exception_demo {
static Exception_demo a1;
 int x =10;
	public static void main(String[] args) {
		try {
			a1 = null;
			System.out.println(a1.x);
		} 
		finally {
			System.out.println(100);
		}
		System.out.println(200);

	}

}
