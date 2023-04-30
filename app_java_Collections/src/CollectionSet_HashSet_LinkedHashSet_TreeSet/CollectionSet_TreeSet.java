package CollectionSet_HashSet_LinkedHashSet_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionSet_TreeSet {
//	..TreeSet sorts the data first while Inserting and then stores the data into it. While inserting data, it compares with the previous values, 
	//and checks if currentElement inserted is greater or not then previous, and if yes, then it puts the current larger value after the previous small value.
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet<Integer>();
		treeSet.add(30);
		treeSet.add(20);
		treeSet.add(100);
		treeSet.add(60);
		treeSet.add(40);
		treeSet.add(40);//TreeSet doesn't allow duplicate values also.
//		treeSet.add("deba");// Tree Set cannot contain Heterogeneous Elements
//		treeSet.add(null);//gives a NullPointerException, as doesn't allow null values.
		
//		Some methods for manipulating the values of Tree Set.
		System.out.println("Reverse Set: "+treeSet.descendingSet()); 
		System.out.println("Head Set: "+treeSet.headSet(30));  
        System.out.println("SubSet: "+treeSet.subSet(30, 100));
        System.out.println("TailSet: "+treeSet.tailSet(60));  
        
		System.out.println(treeSet);//sorts the data
		System.out.println("Highest Value: "+treeSet.pollFirst());  
        System.out.println("Lowest Value: "+treeSet.pollLast());  
        
        //Sorting in descending
        Iterator i=treeSet.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
	}

}
