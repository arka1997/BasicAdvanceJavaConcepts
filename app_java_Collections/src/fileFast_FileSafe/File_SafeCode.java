package fileFast_FileSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class File_SafeCode {

	public static void main(String[] args) {
		
//Fail Safe Iterator: First of all, there is no term as fail-safe given in many places as Java SE specifications does not use this term. I am using this term to demonstrate the difference
//between Fail Fast and Non-Fail Fast Iterator. These iterators make a copy of the internal collection (object array) and iterates over the copied collection. 
//Any structural modification done to the iterator affects the copied collection, not original collection. So, original collection remains structurally unchanged. 
	CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
     Iterator itr = list.iterator();
     while (itr.hasNext()) {
         Integer no = (Integer)itr.next();
         System.out.println(no);
         if (no == 8)

             // This will not print,
             // hence it has created separate copy
             list.add(14);
         
//         Also, those collections which don’t use fail-fast concept may not necessarily create clone/snapshot of it in memory to avoid ConcurrentModificationException. 
//         For example, in case of ConcurrentHashMap, it does not operate on a separate copy although it is not fail-fast. Instead, it has semantics that is 
//         described by the official specification as weakly consistent(memory consistency properties in Java). Below code snippet will demonstrate this:
//         Example of Fail-Safe Iterator which does not create separate copy.
      // Creating a ConcurrentHashMap
         ConcurrentHashMap<String, Integer> map
             = new ConcurrentHashMap<String, Integer>();
   
         map.put("ONE", 1);
         map.put("TWO", 2);
         map.put("THREE", 3);
         map.put("FOUR", 4);
   
         // Getting an Iterator from map
         Iterator it = map.keySet().iterator();
   
         while (it.hasNext()) {
             String key = (String)it.next();
             System.out.println(key + " : " + map.get(key));
   
             // This will reflect in iterator.
             // Hence, it has not created separate copy
             map.put("SEVEN", 7);
         }
     }
 }

}
