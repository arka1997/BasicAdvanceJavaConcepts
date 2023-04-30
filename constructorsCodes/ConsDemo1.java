package constructorsCodes;

public class ConsDemo1 {
	//STATIC method is called First, then IIB block is called automatically, and then constructor when we create object, and then non-static methods
	ConsDemo1(){
		System.out.println(100);
		return;
	}
	{//this is the block which will be executed just before constructor,and then other methods
		System.out.println("halo, I am IIB");
	}
	public static void main(String[] args) {
		ConsDemo1.test();
		ConsDemo1 c1 = new ConsDemo1();

	}
	public static void test() {
		System.out.println("I am called by static way");
	}
}
