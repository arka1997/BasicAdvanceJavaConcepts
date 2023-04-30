package annotations;

public class SuppressWarningAnnotation {

	// ("unused") in @SuppressWarnings("unused"), meaning suppose we create a variable, and we don't use it. So it's is 'unused'.So, this unused data are suppressed.
	// @SuppressWarnings can be used in 2 places:
	// 1) 1st, just right on top of the line where warning is shown
	// 2) On top of the whole method block, to suppress all warnings inside method together by just declaring it once.
	
	public void test(){
		//So, instead of declaring "@SuppressWarnings("unused")" individually for every Yellow warning, we declare that at the top of a method directly.
		@SuppressWarnings("unused")//Now we use @Suppress to tell compiler not to show such kind of warning and thus suppress it.
		int x;//here as we have not initialized the value, so compiler will give yellow warnings, to initialize it.
		@SuppressWarnings("unused")
		int y;
	}
	
	//Here we directly defined the annotation at the top of test() method directly. So no need to define it individually inside code
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x;
		int y;

	}

}
