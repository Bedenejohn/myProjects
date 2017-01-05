package earlyDays;
//This is the behaviors of this class
/*//getBalance() - returns the balance
//deposit() - accepts an amount and increases the balance by this amount 
//withdraw - accepts an amount and decreases the balance by this amount
//applyInterest -accepts an interest rate(in decimal form) and increases the balance by this rate
*/
import java.util.Scanner;
public class SavingsAccount {
	//states
	private int deposit;
	private int balance;
	private int withdraw;
	private double interest;
	private static Scanner scan = new Scanner(System.in);
	public int getBalance() {	
		return balance;
	}
	
	public int deposit(int amount){
		return amount;
	}
	public int withdraw(int amount){
		return amount;
	}
	public double applyInterest(double interest){
		return interest;
	}
	public static void main(String [] args){
		System.out.println("Enter your balance"+ scan);
	}

}
