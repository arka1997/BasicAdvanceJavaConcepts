package p2;

public class VarDemo {
	int c = 115;
//	int Public = 40;
//	int String = 10;
//	var bbc = "hellow";
//	var bbd = 10.4;
	public static void main(String[] args) {

		int Public = 40;//can be declared both as local and gobal, but non-static
		int String = 10;//can be declared both as local and gobal, but non-static

		//int System = 20;//showing error, ask the reason

		VarDemo m = new VarDemo();
	        System.out.println(m.c);
	        //can print both local and global variable
//			System.out.println(m.String);
//			System.out.println(m.Public);
			System.out.println(String);
			System.out.println(Public);
	}
}
