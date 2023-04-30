package iibSibSuper;

public class SuperChildClass extends SuperParentClass {
	SuperChildClass(){//to call this constructor, we need to create one object with no arguments
		//super();//by default super is placed by compiler during compilation
	}
	SuperChildClass(int x){//to call this constructor we need another object, but with arguments.
		super(100);
	}
public static void xx() {
	System.out.println(200);
}
	public static void main(String[] args) {
		new SuperChildClass();//this calls the first constructor
		SuperChildClass s1 = new SuperChildClass(100);//this calls the second constructor
		s1.childMethod();
		
	}
public void childMethod() {
	//we can use a
	super.xyz();
	super.xyzStatic();//while calling static method compiler changes from super.xyzStatic() to SuperParentClass.xyzStatic()
	System.out.println(super.x);
	System.out.println(super.y);
	this.xx();//Compiler changes from this.x to SuperChildClass.x when we call static methods from non-static methods.
}
}
