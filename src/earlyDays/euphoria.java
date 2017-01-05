package earlyDays;

public class euphoria {
	public static void main(String [] args){
		String str = new String("Welcome to my place");
		
		System.out.print("Return value:" );
		System.out.println(str.matches("(.*)Tutorials(.*)"));
		
		System.out.print("Return Value:" );
		System.out.println(str.matches("Tutorials"));
		
		System.out.print("Return value:" );
		System.out.println(str.matches("Welcome(.*)"));
	}

}
