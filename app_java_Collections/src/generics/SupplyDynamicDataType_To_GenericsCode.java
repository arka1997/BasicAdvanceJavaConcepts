package generics;

public class SupplyDynamicDataType_To_GenericsCode {
	//Supplying values and various Datatype of Objects inside Generics, and pass them to the "GenericsCode" class.
	public static void main(String[] args) {
		GenericsCode<Integer> a1= new GenericsCode<>(24);//now here we supply the data type we want inside the Generics to the "Generic" Class, and a value of same datatype.
		GenericsCode<String> a2 = new GenericsCode<>("Deba");
		GenericsCode<Character> a3 = new GenericsCode<>('B');	
	}

}
