package cloningCodes;

public class CloneBeginingCode implements Cloneable{
	int x=10;
	public static void main(String[] args) {
		// The process of creating the replica of a particular object, by copying the content of one object completely into another object.
		CloneBeginingCode cln = new CloneBeginingCode();
		
		
		//Now here type casting is done because, clone() is a method of Object class, and creates copy of Original object and returns an address, which is of Object type,
		//So, thatswhy we are explicitly downcasting the "Object type" address to this current "Class Type".
		
		try {//clone() method creates a compile time exception, so surrounding it with try-catch.
			
			CloneBeginingCode cln2 = (CloneBeginingCode)cln.clone();//Now another new Copy of the original Object is created. This is more fast rather then creating multiple objects with "new" keyword.
			System.out.println(cln);
			System.out.println(cln2);
			System.out.println("Original Object = "+cln.x+" "+"Clone Object = "+cln2.x);//Both prints 10, 10
			//inside below loop, we use our traditional way of creating multiple Objects of same class, where every time in a new Object, methods and variables 
		//of these class are loaded, which is length process and time consuming for compiler.
			for(int i=0;i<100000;i++) {	
				System.out.println(new CloneBeginingCode());
			}
			//Advantages: Instead of creating new Object and reloading methods to it, we use clone() to just copy an object multiple times. Saves time.
			for(int i=0;i<1000;i++) {	
				System.out.println(cln.clone());
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
