package thisCodes;

public class thisCallNonStaticMethod {
	int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisCallNonStaticMethod t1 = new thisCallNonStaticMethod();
			t1.test();
	}
	public void test() {
		System.out.println("Now calling test2 method using this, as this is also reference variable holdin object address");
		this.test2(this.x);
		test2(this.x);//when we don't use this inside a non static method to call another non static method, then compiler by default puts a "this" with the method.So, we can write this, but it's a wrong way.
	}
	public void test2(int val) {
		System.out.println(" 'this' can be used as an argument");
		System.out.println("ur val is"+" "+val);
		this.test();//if we call again the test function from here, then we get StackOverflow error, because test() method is already loaded in stack, now if we call test() again from this test2() method, then shows error
	}

}
