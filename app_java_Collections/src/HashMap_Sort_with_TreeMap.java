import java.util.Iterator;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_Sort_with_TreeMap {

	public static void main(String[] args) { 
//		creating a HashMap and storing values in it.
		
		Map<String, String> map = new HashMap<>();
		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test3", "C");
		map.put("Test4", "D");

		System.out.println("Printing only keys: "+map.keySet());
		System.out.println("Printing only values: "+map.values());
		System.out.println("Printing Key-Value Pair: "+map.entrySet());
		
		
		//Traversing an HashMap and printing the key and value pair, but doesnot maintains Insertion order.
		Set<Entry<String,String>> entr = map.entrySet();//converting to set type containing Entry Object Values
		System.out.println("Printing Key-Value Pair,doesnot maintains Insertion Order");
		for(Entry<String,String> e : entr) {
			//Now "e" is a reference pointing to an Object, and we use getKey() and getValue() methods to fetch the elements(key,value) one by one. 
			System.out.println("Key: "+e.getKey()+"Value: "+e.getValue());
		}
		
//		Traversing the elements in the LinkedHashMap and Printing values,But maintaining insertion order.
		
		Map<String,String> map2 = new LinkedHashMap<>();
		map2.put("deba1","A");
		map2.put("deba2","B");
		map2.put("deba3","C");
		map2.put("deba4","D");
		Set<Entry<String,String>> entr2 = map2.entrySet();
		System.out.println("Converting the values of HashMap to 'Set' :"+entr2);
		System.out.println("Sorted Series");
		for(Entry<String,String> e1: entr2) {
			System.out.println("Key: "+e1.getKey()+"Value: "+e1.getValue());
		}
		
//		Sorting an HashMap by using -> i) TREE_MAP
		HashMap<Integer, String> map3 = new HashMap<>();//creating an HashMap
		map3.put(400, "Deba4");
		map3.put(200, "Deba2");
		map3.put(300, "Deba3");
		map3.put(100, "Deba1");
		TreeMap<Integer,String> tre = new TreeMap<>(map3);//Sending the reference of HashMap in the Constructor of treeMap to sort the elements of the HashMap Object.
		Iterator itr = tre.keySet().iterator();//keySet() returns only the keys, and we iterate over the keys only. Directly Iterator will not work without "keySet()" because it has key and value both. So Iterating not possible, so we either Iterate over Keys, or over Values
		while(itr.hasNext()) {//Now traversing over the keys only for checking if exist or not
			int key = (int)itr.next();//here next() returns a "key" of Object type due to everything made of Wrapper Class in collection, so its downcasted to "int"
			System.out.println("Key:"+key+" "+"Value: "+tre.get(key));
		}	      
	}
position in company, 

}
