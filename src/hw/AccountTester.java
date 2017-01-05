package hw;

public class AccountTester {
	public static void main(String[] args){
		Account a = new Account(500, "Ryas");
		Account b = new Account(600, "Yana");
		try{
			a.mergeAccount(b);
		}
		catch(IllegalArgumentException r){
			System.out.println(r);
		}
		System.out.println(a.toString());
	}
	
	
}
