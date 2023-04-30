package optionalClass;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		String[] str = new String[5];
//		System.out.println(str[4].charAt(4));//This gives Null Pointer Exception which can be handled using try catch block
		//But there is another way to handle "nullPointerException" by using Optional class. If Optional returns null values or
//		non-null values. If null values is present in Optional, then we can return a our own defined message for that Exception
		
		Optional<String> val = Optional.ofNullable(str[4]);//Optional is a container object which may or may not contain a non-null value. You must import java.util package to use this class. If a value is present, isPresent() will return true and get() will return the value.
//		OfNullable() checks if the value inside it contains a null value or not, if yes, then returns an empty instance of Optional and throws "nullPointerException".
//		System.out.println(val.get());//throws "nullPointerException", because trying to fetch a value which points to null
		//Now we handle this value by printing a message against the empty instance
		System.out.println("str[4] doesnot contains any values, so returns empty instance: " +val);//returns an Optional.empty() instance
		System.out.println("str[4] doesnot contains any values, so: "+val.isPresent());
		

		//now storing a value at index 3
		str[3] = "Deba";
		Optional<String> val2 = Optional.ofNullable(str[3]);//checking if str[3] has non-null or null values.
		if(val2.isPresent()) {
			System.out.println("Value is Present: "+val2.isPresent());//returns true as str[3] contains a value
		}else {
			System.out.println("Value is null");
		}
		
		//calling the "checknullPointers()" method,
		OptionalClassDemo o1 = null;
		OptionalClassDemo o2 = new OptionalClassDemo();
		OptionalClassDemo.checknullPointers(o1);
	}
	
	//now creating a static method and passing Object reference as argument in this method
	public static boolean checknullPointers(Object a1) {//here we write the refernce with "Object" type, so that refernce address of any class can be send in this argument. Now creating Object of different class, and calling this "checknullPointers()" method,and passing the refernce of that class as an argument of this method, for checking null Pointer Exception.
		Optional<Object> val3 = Optional.ofNullable(a1);
		if(val3.isPresent()) {
			return true;
		}else {
			System.out.println("Null Value");
			return false;
		}
	}

}
