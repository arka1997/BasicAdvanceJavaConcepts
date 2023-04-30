package annotations;

public class DeprecatedAnnotation {

	//@Deprecatedthis annotation means, whenever we write this annotation on top of a class or a method, then That means it's outdated and shouldn't be 
	//continued to be used by other Developers, it's not important anymore and may be removed in future. So, to these kind of methods, which are very old, and
	//should be replaced by new methods() with new features, are denoted by this @Deprecated, to make developers know that it's not important anymore.
	
	public static void main(String[] args) {
		DeprecatedAnnotation d1 = new DeprecatedAnnotation();
		d1.findByNames();
	}
	@Deprecated//this method is outdated, but still I am using it as a developer. So marking it with @Deprecated, so that other developer's when gets my code 
			   //will not continue with this method, and use the new method only.
	private void findByNames() {//If other developer, when gets my application use this method "findByNames" in any place of this code, then he will get a warning from the compiler that 
								//this method is Deprecated, and shouldn't be used.Instead use the new method with new added features, but function will be 
								//same like the old one, but more enhanced
		System.out.println("I am searching Record");
	}
	//Now the new method with new features is "searchById()", which is a replacement of Old method "findByNames()".
	public void searchById() {
		//Some new features are added to these for replacing the previous one
	}
}
