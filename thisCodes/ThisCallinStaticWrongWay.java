package thisCodes;

public class ThisCallinStaticWrongWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisCallinStaticWrongWay t1 = new ThisCallinStaticWrongWay();
		t1.test();
	}
	public void test() {
		this.test2();//compiler changes from this.x to A.x
	}
	public void test2() {
		System.out.println("Code will compile, but it's wrong way, compiler changes 'this.x' to 'class_name.x' ");
	}
}
