package fileCodes;

import java.io.File;
import java.io.FileReader;

public class FileStroreInArray {
public static void main(String[] args) {
	try {
		File f = new File("D://jackdaniel//pankaj.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int)f.length()];//here the array size is always integer for static, now if we write length() method, then length() returns (Long) value, which won't be spported in that place where array size is declared, [6(int)] correct size , [a.length()(Long)] Wrong size, so (Long) is changed to (int) by downCasting
		for(int i=0;i<f.length();i++) {
		System.out.println((char)fr.read());
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
