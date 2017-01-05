package hw;

public class EngineTest {
	
	public static void main(String[] args) {
		Engine en = new Engine();
		try{
			en.init();
			en.run();
			
		}
		catch(RuntimeException e){
			System.out.println(e);
			en.close();
			//System.out.println(e);
		}
		en.close();

	}

}
