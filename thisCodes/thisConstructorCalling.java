package thisCodes;

public class thisConstructorCalling {
	thisConstructorCalling(){
		this(30);
	}
	thisConstructorCalling(int x){
//		this();
		System.out.println(100);
	}
	//we can create objects in static method, with reference variable, we can call even non static method, but we cannot use this inside static method
	public static void main(String[] args) {
		thisConstructorCalling t1 = new thisConstructorCalling();
	}

}
