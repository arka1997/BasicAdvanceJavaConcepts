package generics;

public class GenericsCode<T> {
	//Creating a Generics class to make the datatype dynamic. "T" is the constant where the datatype will be supplied from another class.
	
	T val;//creating a  value of type "T".
	GenericsCode(T val){
		this.val = val;
		System.out.println(val);
	}

}
