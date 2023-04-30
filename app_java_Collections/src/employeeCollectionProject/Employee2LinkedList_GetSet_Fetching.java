package employeeCollectionProject;

import java.util.LinkedList;

public class Employee2LinkedList_GetSet_Fetching {

	public static void main(String[] args) {
		//creating an personal Object to show How set method works.Creating an object with no arguments in constructor.
		EmployeeEncapsulation login = new EmployeeEncapsulation();
		login.setLoginDetails("rockingdeba","deba1234",50); //setting the username and password using "set" methods in encapsulation
		System.out.println("Printing Login details by accessing private memebers of Another class using 'Get' & 'Set' Methods");
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		System.out.println(login.id());
		
		//creating Object for adding Objects in LinkedList containing user Details
		EmployeeEncapsulation deba = new EmployeeEncapsulation("debanjan","sarkar",24);
		EmployeeEncapsulation arka = new EmployeeEncapsulation("arka","sarkar",20);
		EmployeeEncapsulation tuban = new EmployeeEncapsulation("tuban","sarkar",30);
		
		LinkedList<EmployeeEncapsulation> link = new LinkedList<>();
		link.add(deba);
		link.add(arka);
		link.add(tuban);
		
		for(EmployeeEncapsulation e : link) {
			System.out.println("Printing details of Users with getSet methods");
			System.out.println(e.getFirstName());//to access the private data, like firstName,id, we have to use "get" methods to call fetch those datas.
			System.out.println(e.getLastName());
			System.out.println(e.id());
		}
	}

}
