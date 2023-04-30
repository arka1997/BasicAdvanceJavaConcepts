package javaCollectionArrayLinked_List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorVsLoopsCollectionArrayList{

	public static void main(String[] args) {
		//ITERATOR Interface is used to traverse the ArrayList using for loop and read the data and print it.
		ArrayList<String> str = new ArrayList<>();
		str.add("deb");
		str.add("deb1");
		str.add("deb2");
		str.add("deb3");
		str.add("deb4");
		Iterator itr = str.iterator();//In ArrayList, there is a method "iterator", which returns object of "Itr" class implementing Iterator Interface,
									  //and has defined methods like .hasNext() , next(). Now with the address of "Itr" class, we store it in reference "itr",
									  //and use the inbuilt methods with that reference as shown below.
		
		while(itr.hasNext()) {//hasNext() will check if there is  any sub-Object exist next ,if yes, then returns true and points to that object.
			System.out.println("Value of x:"+itr.next());//next() method reads the value inside Object and after returning it, points to next Object. 
												 //Cursor points to next index, and lastRet point to current index and returns it.
			itr.remove();//here Iterator is one Thread which is Operating now, but now another Thread i.e., ArrayList, if used to remove an element, then we will get "ConcurrentModificationException", as one Thread(Iterator) is already Traversing, and another THREAD(ArrayList) is trying to manipulate the Data. so error.
		}
		itr.remove();	
		//removes the current element whose index is returned by next(), and lastRet is set to -1.
		System.out.println(str);
		
		//Traversing ArrayList using forLoop
		ArrayList<Character> ch = new ArrayList<Character>();
		ch.add('d');
		ch.add('e');
		ch.add('b');
		ch.add('a');
		ch.add('n');
		ch.add('j');
		ch.add('a');
		ch.add('n');
		System.out.println("Traversing and printing Characters with for-loop:");
		for(int i=0;i<ch.size();i++) {
			System.out.print(ch.get(i));
		}
		
//		Traversing ArrayList with foreach loop
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(4);
		ints.add(10);
		ints.add(15);
		ints.add(420);
		System.out.println("Traversing and printing numbers with for-each loop:");
		for(Integer i : ints){
			System.out.print(i);
		}
		
//		Here elements are iterated only in reverse order from back to front using ListIterator
		ArrayList<Float> f = new ArrayList<>();
		f.add(10.0f);
		f.add(20.5f);
		f.add(30.5f);
		f.add(40.5f);
		f.add(55.5f);
		System.out.println("Traversing a ArrayList backwards and priting in reverse Order");
		ListIterator<Float> rev = f.listIterator(f.size());//ListInterface is used to traverse in both direction
		while(rev.hasPrevious()){//Returns true if this list iterator has more elements when traversing the list in the reverse direction.
			System.out.println(rev.previous());
		} 
	}

}
