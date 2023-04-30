package CollectionSet_HashSet_LinkedHashSet_TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> hasSet = new HashSet<Integer>();
		hasSet.add(10);
		hasSet.add(20);
		hasSet.add(30);
		hasSet.add(40);
		hasSet.add(40);//Duplicate values will be not allowed and Ignored. So, "40" 2 times will not be shown in the output.
		hasSet.add(null);//storing null value is possible in HashSet
		System.out.println(hasSet);//Doesnot maintains Insertion Order
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(90);
		set2.add(100);
		hasSet.addAll(set2);
		System.out.println(hasSet);
		
		
//		Traversing through an HashSet using: 1)Iterator 2)For-each Loop
		Iterator itr = hasSet.iterator();
		System.out.println("Printing The values by traversing through Arraylist using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(Integer x:set2) {
			System.out.println(x);
		}
		System.out.println("The size is: "+hasSet.size());
		
		System.out.println("Is the value '20' removed: " +hasSet.remove(20));
		System.out.println(hasSet);
		
		//HashSet also stores Unique Collections of Objects like ArrayList, or LinkList
		HashSet<ArrayList> set3 = new HashSet<ArrayList>();//here we declare a HashSet of type <ArrayList>, storing ArrayList inside it.
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(20);
		arr2.add(10);
		
		set3.add(arr);
		set3.add(arr2);	  
	        // print the set size to understand the
	        // internal storage of ArrayList in Set
	        System.out.println(set3.size());
	        System.out.println(set3);
	        
	        //For converting a set into an array
	        Object[] array = set3.toArray();
	        System.out.println(array);
	}

}
