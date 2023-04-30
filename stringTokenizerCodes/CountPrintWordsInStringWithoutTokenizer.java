package stringTokenizerCodes;

public class CountPrintWordsInStringWithoutTokenizer {

	//Split  a string when spaces is found without String Tokenizer.
	public static void main(String[] args) {
		String str = "hellow debanjan Sarkar";
		String[] split = str.split("\\s");//split method will convert the String into an array of 
		for( String s : split) {
			System.out.println(s);
		}
	}

}
