package classCasting;

public class childClassCasting extends parentClassCasting{
	public static void main(String[]args) {
		 childClassCasting a1 = (childClassCasting) new parentClassCasting();	
		System.out.println(a1);
	}
}
