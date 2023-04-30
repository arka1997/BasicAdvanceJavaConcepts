package p1;

 class E {
	public static void observe() {
		System.out.println("Students are good");
	}
}
 public class Student extends E{
	public static void dsiplay() {
		System.out.println("fuck");
	}
	public static void main(String[] args) {
		E e = new Student();
		e.observe();
	}
	
}
