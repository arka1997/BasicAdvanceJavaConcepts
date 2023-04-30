package singletoneDesignPattern;

public class SingletoneDesignPattern {
	
	static SingletoneDesignPattern s1;
	
	private SingletoneDesignPattern(){
	}
		
	public static SingletoneDesignPattern getInstance() {
		if(s1 == null) {
			s1 = new SingletoneDesignPattern();
		}
		return s1;
	}
}
