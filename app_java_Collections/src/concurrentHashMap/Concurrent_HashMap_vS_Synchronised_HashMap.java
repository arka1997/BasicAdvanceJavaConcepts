package concurrentHashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_HashMap_vS_Synchronised_HashMap {
	
	//Demo to show Synchronised Map Method in HashMap vs ConcurrentHahmap.
	public static void main(String[] args) {
		
		//creating an Hashmap
		Map<Integer,String> hash = new HashMap<>();
		System.out.println("Printing SynchronisedHashMap values");
		hash.put(100, "Deba0");
		hash.put(200, "Deba1");
		hash.put(300, "Deba2");
		hash.put(400, "Deba3");
		
		//Making the HashMap Synchronised
		Map<Integer,String > hash2 = Collections.synchronizedMap(hash);//Returns a synchronized (thread-safe) map backed by the specified map. In order to guarantee serial access, it is critical that all access to the backing map is accomplishedthrough the returned map.
		System.out.println(hash2);
		
		//creating ConcurrentHashMap, where multiple Threads can be created for manipulating the Table,i.e., Reading and writting.
		ConcurrentHashMap<Integer,String> con = new ConcurrentHashMap<>();
		System.out.println("Printing ConcurrentHashMap values");
		con.put(100, "Deba0");
		con.put(200, "Deba1");
		con.put(300, "Deba2");
		con.put(400, "Deba3");
		System.out.println(con);
		System.out.println(con.get(100));
	}

}
