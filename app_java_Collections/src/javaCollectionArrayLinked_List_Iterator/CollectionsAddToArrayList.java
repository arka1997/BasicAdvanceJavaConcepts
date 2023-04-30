package javaCollectionArrayLinked_List_Iterator;

import java.util.ArrayList;

public class CollectionsAddToArrayList {
	private String name;
	 CollectionsAddToArrayList(String name) {
		 this.name = name;
	 }
	 //Internally it is implemented by dynamic array.
//	 Initial size of arrraylist is 10.
	 //When we exceed the initial size automatically ArrayList increases the size by 1.5 times
//	 Arraylist maintains insertion order.
	 //It can consist of duplicate elemnts.
//	 Performance of ArrayList: We can read or fetch the value from an ArrayList, directly using get(int index) method with O(1) time complexity.
//	 Disadvantage of ArrayList: When we try to insert a value in the middle of an array,then we have to shift all the elements by one position to its left, and then insert the new element in the middle.In worst case it will take O(n) time complexity.So time is more, and performance is reduced. Instead use LinkList to insert elements in middle
	
	 public static void main(String[] args) {
		CollectionsAddToArrayList col = new CollectionsAddToArrayList("Dilip");
		//In Array List, Heterogeneous data is stored.
		ArrayList x = new ArrayList();
		boolean add =x.add(10);//this 10 is stored in form of Object using Wrapper "Integer=10"
		x.add(new Integer(20));//both way of storing the name is same
		boolean add1 = x.add("bani");//everyone returns  boolean value
		boolean add2 =x.add(new String("bisu"));
		boolean add3 =x.add(col);
		boolean add4 =x.add(true);
		boolean add5 =x.add('a');
		boolean add6 =x.add(10.0);
		
		System.out.println(x);
	}
//Advantage: Reading of data would give us best preformance
}
