package thisCodes;

public class ThisCurrentObject {
	int x = 10;
	static ThisCurrentObject a = new  ThisCurrentObject ();//creating a global reference variable means it will load all the non static methods into the global object.
	public static void main(String[] args) {
		ThisCurrentObject a1 = new ThisCurrentObject();
		System.out.println(a1.x);
		a1.test();
		ThisCurrentObject a2 = new ThisCurrentObject();
		a2.test2();
		ThisCurrentObject a3 = new ThisCurrentObject();
		a3.test3();
	}
	public void test() {
		 ThisCurrentObject  a5 = new  ThisCurrentObject ();
		 a5.test2();
		System.out.println(this);
		a.test2();
	}
	public void test2() {
		System.out.println(this);
	}
	public void test3() {
		System.out.println(this);
	}
}
