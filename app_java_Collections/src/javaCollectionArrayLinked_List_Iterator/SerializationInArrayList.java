package javaCollectionArrayLinked_List_Iterator;

import java.io.*;
import java.util.*;

public class SerializationInArrayList {

	public static void main(String[] args) {
		          ArrayList<String> al=new ArrayList<String>();  
		          al.add("Ravi");    
		          al.add("Vijay");    
		          al.add("Ajay");    
		            
		          try  
		          {  
		              //Serialization  
		              FileOutputStream fos=new FileOutputStream("file");  
		              ObjectOutputStream oos=new ObjectOutputStream(fos);  
		              oos.writeObject(al); //here the arrayList object is converted to binary for serialisation
		              fos.close();  
		              oos.close();  
		              //Deserialization  
		              FileInputStream fis=new FileInputStream("file");  
		              ObjectInputStream ois=new ObjectInputStream(fis);  
		            ArrayList  list=(ArrayList)ois.readObject();  //the object is explicitly downcasted to ArrayList again and printed
		            System.out.println(list);    
		          }catch(Exception e)  
		          {  
		              System.out.println(e);  
		          }        

	}

}
