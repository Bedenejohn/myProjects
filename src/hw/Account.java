package hw;

public class Account {
	private double balance;
	private String name = "Main";

	public Account(double balance, String name) {
		this.balance = balance;
		this.name = name;
               if(this.name != name){
                 throw new IllegalArgumentException("The names are not the same!");
               }
	}
	
	public void mergeAccount(Account a) {
		this.balance += a.balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", name=" + name + "]";
	}
}


