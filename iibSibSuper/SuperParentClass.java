package iibSibSuper;

public class SuperParentClass {
	SuperParentClass(){
//		this(100);
		System.out.println("Default Parent Constructor");
	}
	SuperParentClass(int x){
		System.out.println("Parent constructor");
	}
	int x= 34;
	static int y=10;
	public static void xyz() {
		System.out.println("calling Non static method with Super");
	}
	public static void xyzStatic() {
		System.out.println("calling Non static method with Super");
	}
	public static void main(String[] args) {
		

	}

}
