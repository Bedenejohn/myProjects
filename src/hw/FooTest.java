package hw;

public class FooTest {
	public static void main(String[] args){
		int i = 0;
		Foo fo = new Foo();
		try{
			fo.eval(i);
		}
		catch(Exception e){
			System.out.println("There is an Array Index Out of Bonds Exception: " + e);
		}
		finally{
			System.out.println("Everything worked out I guess");
		}
		
	}

}
