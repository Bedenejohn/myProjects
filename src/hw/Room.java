package hw;

public abstract class Room {
	protected double rate;
	protected int numGuest;
	protected double extraGuestFee;
	
	public Room(double rate, int numGuest){
		this.rate = rate;
		this.numGuest = numGuest;
	}
	
	public abstract String getBill();
	
	
	public double getRate(){
		return rate;
	}
	public void addGuest(int numGuest){
		this.numGuest = numGuest;
	}

}
