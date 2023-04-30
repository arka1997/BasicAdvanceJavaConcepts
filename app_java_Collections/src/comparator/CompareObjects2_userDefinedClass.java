package comparator;

import java.util.Comparator;

public class CompareObjects2_userDefinedClass implements Comparator<CompareObjects1_userDefinedClass>{//here inside Generics we declare the type of Object

	public static void main(String[] args) {
		CompareObjects2_userDefinedClass cmp = new CompareObjects2_userDefinedClass();
		int val = cmp.compare(new CompareObjects1_userDefinedClass("Deba","Sarkar",44), new CompareObjects1_userDefinedClass("Tuban","Kumar",32));//here we pass two arguments  
		//which creates a new Object and returns the address of both the Object.Then those are send as an argument to the compare() method.
		System.out.println(val);
	}

	@Override
	public int compare(CompareObjects1_userDefinedClass o1, CompareObjects1_userDefinedClass o2) {
		//compareTo() methods take only String Object Inputs, and if a Integer is inserted then it should be converted to String using "toString()" methods.
		return o1.age.toString().compareTo(o2.age.toString());//comparing content(Surname) of two objects, and determining on the value a positive/negative/zero Integer returned.
	}

}
