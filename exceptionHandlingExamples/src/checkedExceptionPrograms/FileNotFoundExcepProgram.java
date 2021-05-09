package checkedExceptionPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotFoundExcepProgram {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:/anu2/save.txt");
		FileWriter fw = new FileWriter(f1);
		fw.write("how are you");
		fw.flush();
	}

}
