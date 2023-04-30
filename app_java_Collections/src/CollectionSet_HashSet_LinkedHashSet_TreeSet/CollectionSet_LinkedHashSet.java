package CollectionSet_HashSet_LinkedHashSet_TreeSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionSet_LinkedHashSet {
	//LinkedHashSet maintains the Insertion Order as internally Doubly LinkedList is implemented in it.
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkSet = new LinkedHashSet<Integer>();
		linkSet.add(10);
		linkSet.add(20);
		linkSet.add(30);
		linkSet.add(40);
		linkSet.add(40);//cannot contain duplicate values
		linkSet.add(null);//can contain "null" values just like HashSet
		System.out.println("Original LinkedHashSet:"
                + linkSet);
		
		System.out.println("Size of LinkedHashSet = "
                 + linkSet.size());
		 
	// Checking for element whether it is present inside
	// Set or not using contains() method
	System.out.println("Checking if A is present="
	                 + linkSet.contains(30));
	
	//Iterating though the LinkedHashSet using iterators
	Iterator itr = linkSet.iterator();
	while (itr.hasNext()) {
	    System.out.print(itr.next() + ", ");
	
		}
		
		// Removing existing entry from above Set
		// using remove() method
		System.out.println("Removing D from LinkedHashSet: "
		                 + linkSet.remove(40));
		System.out.println("Original LinkedHashSet:"
                + linkSet);
		
		// Removing existing entry from above Set
		// that does not exist in Set
		System.out.println(
		  "Trying to Remove Z which is not "
		  + "present: " + linkSet.remove(70));
	}
}
