package hw;

public class Engine {
	
	public void init() {
		if( Math.random() < 0.5 )
			throw new RuntimeException();
		else
			System.out.println("init()");
	}
	
	public void run() {
		System.out.println("run()");
	}
	
	public void close() {
		System.out.println("close()");
	}
}
