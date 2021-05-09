package checkedExceptionPrograms;

import java.io.File;
import java.io.IOException;

public class IOExceptionProgram {
	public static void main(String[] args){
	
		
	}
	public static void create() throws IOException {
		File f1 = new File("D:/anu1/file.txt");
		f1.createNewFile();
		
	}

}
