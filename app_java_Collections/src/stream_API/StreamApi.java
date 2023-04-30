package stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		List<String> strList2 = Arrays.asList("Deba","","Bisu","Debu","");
		long count = strList2.stream().filter(x->x.isEmpty()).count();
			System.out.println(count);
	}
	
	}
