package employeeCollectionProject;

import java.util.Iterator;
import java.util.LinkedList;

public class Employee2LinkedList_ForEach_Fetching {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		EmployeeEncapsulation e1 = new EmployeeEncapsulation("deba@gmail.com",7003543);
		EmployeeEncapsulation e2 = new EmployeeEncapsulation("deba@gmail.com",932234);
		EmployeeEncapsulation e3 = new EmployeeEncapsulation("deba@gmail.com",692213);
		
		LinkedList<EmployeeEncapsulation> l1 = new LinkedList<>();//creating a LinkList Collection
//		now adding the objects we created in the LinkList using the add() function
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		System.out.println(l1);//will print the 3 object Address stored in the list.
//		Now to fetch the elemnts or data present in the Objects
		for(EmployeeEncapsulation e : l1) {
			System.out.println(e.email);
			System.out.println(e.number);
		}
	}

}
