package p2;

public class staticDemo {
	int x =10;
	static int y= 10;
	public static void main(String[]args) {
		staticDemo f1 = new staticDemo();
		staticDemo f2 = new staticDemo();
		f1.x = 20;//here we overrite a non static value, but the value is changed in the variable present in the object, 
		//not in the class, so everytime we create an object then a copy of the original variable is passed to the new objects
		//which are getting created, and not the overrided value of static variable.
		System.out.println(f1.x);//so value changes to 20
		System.out.println(f2.x);
		System.out.println(staticDemo.y);
		
	}
}
