package stringsDemo;

public class ImmutableDemo {
	private final int id;
    private final String name;

    public ImmutableDemo(int id, String name) {
    	this.name = name;//"this" points to current object, and as "ImmutableDemo i1" reference variable is local to main block, its can't be used in other blocks, so "this" keyword is used which also points to same object that "i1" is pointing to
        this.id = id;
    }
    public void setId(int id, String name) {//this block is to be avoid, no setters allowed in immutable class
    	
//	this.name = name;//ERROR, because final variables either has to be initialized while creating it, or it can be initialised 
					 //by constructor while creating objects.why?because ,Compiler starts executing from main method, 
					 //when finds a new() keyword,it creates object, constructor is then called and value is initialized by Constructor at that instant.
					 //Now after object is created, all non-static variables and methods get loaded into object, and compiler sees
					 //a final variable inside object, which is already initialised by constructor before loading them into objects.
					 // But, if we use setMethods to initialise instead of Constructor, then, compiler first goes to main method, 
					 //creates object, but this time compiler, while loading variables and methods to object don't find final variables 
					 //to be initialised, so throws error. As setting final variables with reference variable in some other methods 
					 //becomes too late.
//    this.id = id;//ERROR
    }
    public int getId() {
        return id;
    }
    public String getName() {
    	return name;
    }
	public static void main(String[] args) {
		ImmutableDemo i1 = new ImmutableDemo(100,"hlo");
		i1.setId(100,"hlo");//its of no use
		i1.getId();
		i1.getName();
	}
}
//With immutable classes, states are never modified; every modification of a state results in a new instance, 
//hence each thread would use a different instance and developers wouldn’t worry about concurrent modifications.
//
//2. Some Popular Immutable Classes
//String is the most popular immutable class in Java. Once initialized its value cannot be modified. Operations like trim(), 
//substring(), replace() always return a new instance and don’t affect the current instance, that’s why we usually call trim()
//as the following:
//
//String alex = "Alex";

//alex = alex.trim();