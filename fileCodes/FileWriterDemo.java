package fileCodes;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			File f = new File("D://jackdaniel//pankaj.txt");
			FileWriter fr = new FileWriter(f);
			fr.write(100);
			fr.write(101);
			fr.write(102);
			fr.write(103);
			fr.write(104);
			fr.flush();//to flush out the data to text file, if any data is stucked int the pipes
			fr.close();//for saving and closing the streamOutput, and its mandatory, but dont know why
			}catch(Exception e) {
				e.printStackTrace();
			}
}
}
