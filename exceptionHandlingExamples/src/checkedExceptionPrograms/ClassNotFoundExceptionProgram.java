package checkedExceptionPrograms;

public class ClassNotFoundExceptionProgram {
	private static final String s = "anusha";
	 
    public static void main(String[]  args) throws Exception{
        System.out.println("my name");
        Class.forName(s);
    }
}
