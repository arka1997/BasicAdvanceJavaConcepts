package throwThrows;

public class ApplicationCrashedCatchHandles1 {

	public static void main(String[] args) {
		//suppose if our application is crashed somehow, then we can use "catch" block to restart the application again. Thats another superpower of catch, which is not only to suppress the errors, but also restarting an application again.
		try {
			throw new ApplicationCrashedExceptionClass();//creating the object of customized exception class, and sending it to catch.
		} catch (ApplicationCrashedExceptionClass e) {
			System.out.println(e);
			System.out.println("Application restarting");
		}
		
		
	}

}
