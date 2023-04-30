package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {
//this also uses hashTable, by the process Hashing(converting keys to hshCode()). Content is store in key value pair
	public static void main(String[] args) {
		//Below values are stored in <Key,Value> pair
		HashMap<Integer,String> stdntInfo = new HashMap<Integer,String>();//here class Upcasting occurs and the incomplete methods of "Map" Interface is completed in Child Class "HashMap".
		stdntInfo.put(100, "deba");
		stdntInfo.put(200, "bisu");
		stdntInfo.put(300, "bani");
		stdntInfo.put(300, "bbc");//does not allow Duplicate Values.
		stdntInfo.put(null,"null");
		stdntInfo.put(100,"null");
//		In HashSet the data doesn't stores value in the form of Key Value Pair. Internally it is using HashTable by process of Hashing.
//		Both HashMap and HashSet are not synchronized.
		System.out.println(stdntInfo);
		System.out.println("Fetching values from HashMap: "+stdntInfo.get(100));
		System.out.println(stdntInfo.values());//values() method returns only the values and not the keys.
		System.out.println(stdntInfo.keySet());//keySet() method returns only key set and not the values.
		String str = "vaibhav";
		System.out.println(str.hashCode());
		System.out.println(stdntInfo.remove(200));
		stdntInfo.put(null,"null");
		
		HashMap<Integer,Integer> s = new HashMap<>();
		s.put(200, 400);
		s.put(300, 400);
		s.put(200, 400);
		s.put(200, 400);
		s.forEach((k,v)->System.out.println(k+" "+v));//Iterting through Hashmap
		
	}

}
