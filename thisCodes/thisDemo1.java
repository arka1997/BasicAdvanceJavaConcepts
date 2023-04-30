package thisCodes;

public class thisDemo1 {
	int x=10;
	int y=20;
	public static void main(String[] args) {
		//both this objects are created in different address
		thisDemo1 t1 = new thisDemo1();
		System.out.println(t1);
		t1.test();
		thisDemo1 t2 = new thisDemo1();
		t2.test2();
	}
	public void test() {
		System.out.println(this);
		System.out.println(this.x);
	}
	public void test2() {
		System.out.println(this);
		System.out.println(this.y);
	}

}
