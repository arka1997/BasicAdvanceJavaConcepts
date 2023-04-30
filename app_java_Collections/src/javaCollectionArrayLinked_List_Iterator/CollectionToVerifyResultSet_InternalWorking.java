package javaCollectionArrayLinked_List_Iterator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CollectionToVerifyResultSet_InternalWorking {

	public static void main(String[] args) {
		try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_1","root","tuban1234");
				Statement stmnt = con.createStatement();
				ResultSet results = stmnt.executeQuery("Select * from registration");
				while(results.next()) {
					System.out.println(results);
				}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
