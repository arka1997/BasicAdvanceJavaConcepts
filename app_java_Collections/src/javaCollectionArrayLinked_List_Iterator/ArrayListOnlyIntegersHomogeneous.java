package javaCollectionArrayLinked_List_Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayListOnlyIntegersHomogeneous {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();//This is a Integer type ArrayList for storing only Integers.
		x.add(10);
		x.add(20);
		x.add(40);
		System.out.println("add() method: "+x);//[10, 20, 30]
		Boolean b = x.isEmpty();
		System.out.println("Checks if ArrayList is empty or not: "+b);//false
		System.out.println("size of 1st ArrayList x: "+x.size());//current size is 3
		
		//Insert an element in a particular Index,but,that index should be less then the current size of an array, So, index < current Size(3)
		x.add(2,30);
		System.out.println("add(index,value) method printing 1st Array: "+x);//[10, 20,30,40]
		
		//creating 2nd ArrayList
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(23);
		y.add(26);
		y.add(29);
		
		//Inserting the values of 2nd ArrayList inside the first ArrayList from 2nd Index.
		x.addAll(2,y);
		System.out.println("addAll(index,collection) methods printing,"+"\n"+" 1st Array after Inserting new value: "+x);
		
		//now we will search an check if a values is present in arrayList or not with contains(element).
		if(x.contains(40)) {
			System.out.println("If '40' present, then contains(element=40) method returns true");
		}
		else {
			System.out.println("else contains() returns false if value not present");
		}

		//Fetching or Reading an element from ArrayList based on Index Number using get(index).
		System.out.println("get(Index) for Reading or Fetching Element at 0th index: "+x.get(0));
		
		
		//Replacing one index by setting a new value into that Index and Replacing previous
		x.set(0, 1997);
		System.out.println("set(index,new Element) Replacing an existing Object at 0th Index with new: "+ x);
		
		
		//The indexOf() method returns the position of the first occurrence of specified Object element which is "20"
		System.out.println("indexOf(element) returns index: "+ x.indexOf(20));
		
		//The indexOf() method returns the position of the last occurrence of specified Object element which is "20"
		x.add(2,20);
		System.out.println("Last Updated values of ArrayList is : "+ x);
		System.out.println("Index of the element '20' is : "+ x.lastIndexOf(20));//Returns 2
		
		//sorting in ascending order
		Collections.sort(y);
		System.out.println("Sorting in Ascending: "+ y);
		//Sorting in descending order in 2 ways
		Collections.reverse(y);
		System.out.println("Sorting in Descending: "+y);
		Collections.sort(y,Collections.reverseOrder());
		System.out.println("Another Sorting in Descending: "+y);
		
//		<START REMOVE>
		//Now remove elements from ArrayList on basis of Index
		x.remove(0);
		System.out.println("remove(index) method, '10' wil b deleted: "+x);//1997 is deleted
		
		//Removing elements on the basis of specified condition  
        System.out.println(y.removeIf(s1 -> (s1 % 2 ==0)));   //Here, we are using Lambda expression  
        System.out.println("Removing on basis of the Object Value: "+y);
        
//        //Removing specific element from arraylist on basis of Object values 
//        x.remove(23);  
//        System.out.println("Removing on basis of the Object Value: "+x);
//      <END>
	}

}
