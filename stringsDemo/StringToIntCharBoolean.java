package stringsDemo;

public class StringToIntCharBoolean {

	public static void main(String[] args) {
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		//converting int to string
		int j=20;
		String str = String.valueOf(j);
		System.out.println(str);
	}
}
