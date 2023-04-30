package javaCollectionArrayLinked_List_Iterator;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistSpecialMethods {
	//Internally Doubly LinkedList is implemented
	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<>();
		//numbers will be inserted from head.
//		the number which will be added first, will go to the end, when new numbers are inserted before it, and the printing will start from the number that is inserted last.
		x.addFirst(400);//here the insertion will start at the beginning of LinkList.
		x.addFirst(300);
		x.addFirst(200);
		x.addFirst(100);
		x.addFirst(null);
		System.out.println("Adding values to LinkList: " +x);
		
		LinkedList<Integer> y = new LinkedList<>();
		y.add(200);
		y.add(300);
		y.add(400);
		y.add(500);
		y.addFirst(100);//Insert at the the beginning of LinkList.
		y.addLast(600);//Insert in the end of LinkList.
		y.add(700);//add() method also inserts from last and returns true.
		System.out.println("Inserting in LinkList from the last with add() method and addFirst()"+"\n"+"inserts the values at beginning of LinkList: "+y);
	}

}
