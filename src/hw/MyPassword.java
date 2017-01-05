package hw;

//********************************************************
//Purpose:  To identify whether or not the entered
//        password is valid or invalid.
//
//Author:   Santresia Jones
//
//Course:   CS 1301 A
//
//Date:     October 4, 2016
//
//Program:  MyPassword7.java
//********************************************************
public class MyPassword {
	// Declarations
	private boolean rule1; // true if length >= 8
	private boolean rule2; // true if it contains only letters and digits
	private boolean rule3; // true if password contains 3 or more digits
	private String password;

	// *****************************************************
	// no-argument constructor
	// *****************************************************
	public MyPassword() {

	}// end of constructor

	// ******************************************************
	// verifyPassword7: Recieves password,
	// assigns it to the
	// instance variable,
	// and invokes the four
	// supporting methods below.
	// ******************************************************
	public void verifyPassword7(String pw) {
		password = pw;
		rule1 = verifyLength();
		rule2 = verifyValidCharacters();
		rule3 = verifyNumberOfDigits();

	}// end of verifyPassword7

	private boolean verifyNumberOfDigits() {
		// TODO Auto-generated method stub
		return false;
	}

	// ******************************************************
	// verifyLength: Checks password length
	// and returns true if length >= 8,
	// otherise, returns false.
	// ******************************************************
	private boolean verifyValidCharacters() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean verifyLength() {
		if (password.length() <= 8) {
			System.out.println("Sorry the  password is not valid for the following reason(s)" + "\n"
					+ "1.Violates rules1: the password does not have at least eight characters");
		}
		return rule1;

	}// end of verifyLength method
}
