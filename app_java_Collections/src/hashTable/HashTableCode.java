package hashTable;

import java.util.Hashtable;

public class HashTableCode {

	public static void main(String[] args) {
//		Hashtable is a Legacy Class -> It means, this concept was first in JDK 1.0 buut it later transferred from its parent JDK 1.0 to its next Versions upto JDK 11.
//		HashTable is synchronised whereas a HashMap is not synchronised.
//		But both HashMap and HashTable uses hashTable Internally and data stored in key value pair. As hashMap is not synchronised, its performance is better, but HashTable is synchronised, so performance is slowed as each Thread has ro execute the whole synchronise block, and others have to wait.
		//But Thread safety is their in HashTable because of being synchronised, whereas, Thread Safety is not their in HashMap. When we are achieving Thread safety, we are compromising with the performance.
		
		Hashtable<Integer,String> hashTbl = new Hashtable<>();
		hashTbl.put(110, "Deba");
		hashTbl.put(120, "Bhaskar");
		hashTbl.put(130, "Bani");
		hashTbl.put(140, "Dilip");
		hashTbl.put(140, "Dilip");//can have duplicate values like "Dilip" 2 times, but no duplicate keys(here '140') is allowed. It's ignored.
		System.out.println(hashTbl);
		
		//Finding Size of HashTable
		System.out.println("1)The Size: "+hashTbl.size());
		
		//Searching if the HashTable is empty or not
		System.out.println("2)Check if HashTable is empty or not not and returns Boolean value: "+ hashTbl.isEmpty());
		
		//Fetching a value using get() method.
		System.out.println(hashTbl.get(140));
		
		//For printing only the keys
		System.out.println("3)The keys are: "+ hashTbl.keySet());
		//Returns only the Values
		System.out.println("4)The Values are: " +hashTbl.values());
				
		//Function of containsValue for checking if that value exist in the HashTable or not, if yes, returns true.
		if(hashTbl.containsValue("Deba")) {
			System.out.println("5)checking if the 'value' inside contains() method is present or not in HashTable and searched value is: " + hashTbl.get(110));
		}
		else {
			System.out.println("Not present");
		}
		
		//Checks if the key exist or not in the HashTable
		if(hashTbl.containsKey(130)) {
			System.out.println("6)checking if the 'key' inside containsKey() method is present or not in HashTable and sea and value is: " + hashTbl.get(130));
		}
		else {
			System.out.println("Not present");
		}
		
		//Removing Element and this returns the element that  is removed
		String remove = hashTbl.remove(120);
		System.out.println("7)We are now removing value with the key=120: "+ remove);
		System.out.println(hashTbl);
		
		//Replacing or Updating the previous with the current value
		System.out.println("8)The value with key=110, which is replaced is"+hashTbl.replace(110, "Deba1"));
		System.out.println(hashTbl);
	}

}
