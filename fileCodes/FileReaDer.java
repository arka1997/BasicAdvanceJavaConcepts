package fileCodes;
//import java.io.File;
import java.io.FileReader;
public class FileReaDer {
	int x=10;
	public static void main(String[] args) {
		
		try {
			FileReaDer a1=null;
//			File f = new File("D://jackdaniel//pankaj.txt");
//			FileReader fr = new FileReader(f);
//			a1.test();
//			for(int i=0;i<f.length();i++) {
//			System.out.println((char)fr.read());
			System.out.println(a1.x);
			}catch(NullPointerException e) {
			System.out.println(e);
			//e.printStackTrace();
		}

}}
