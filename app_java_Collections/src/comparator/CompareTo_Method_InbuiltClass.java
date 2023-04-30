package comparator;

public class CompareTo_Method_InbuiltClass {

	public static void main(String[] args) {
		//we know String is an Object
		String x = "xyz";
		String y = "abc";
		System.out.println(x.compareTo(y));//if we compare x with y, and contents of (x>y), then return positive value.
		
		String x1 = "abc";
		String y1 = "xyz";
		System.out.println(x1.compareTo(y1));//if we compare x1 with y1, and contents of (x1<y1), then return negative value.
		
		String x2 = "xyz";
		String y2 = "xyz";
		System.out.println(x2.compareTo(y2));//if we compare x2 with y2, and contents of (x2==y2), then return 0.
	}

}
