package finalizeMethod;

public class FinalizeMethod_Code {
	protected void finalize() throws Throwable
    {
        try {
  
            System.out.println("calling the finalize method from main");
        }
        catch (Throwable e) {
  
            throw e;
        }
        finally {
  
            System.out.println("Calling finalize method"
                               + " of the Object class");
  
            // Calling finalize() of Object class
            super.finalize();
        }
    }
	public static void main(String[] args) {
		FinalizeMethod_Code grbg = new FinalizeMethod_Code();//here we create the object of class, and loading the finalize() method inside it.
		grbg = null;//here we are setting it to null, because if the reference is removed or set to null, then the object is available for Garbage Collection.
		//if grbg would have been pointing to an object, then "Systme.gc()" could not call finalize() method.Conditions are set like that, if no reference, then System.gc() can call finalize method, else not.
		System.gc();//this first checks if any reference pointers are set to null or not, if yes, then finalize() method is called, and the Object is removed by Garbage Collector.
	}
}
