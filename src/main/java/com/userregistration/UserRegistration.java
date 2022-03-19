package com.userregistration;

/*
 * @Purpose :As a User need to
enter a valid FirstName
- First name starts with Cap and has minimum 3 characters
 * 
 * 
 */
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";

	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(NAME);
		return pattern.matches(NAME, fname);
	}

//enter a valid LastName
	public boolean validateLastName(String lName) {
		Pattern pattern = Pattern.compile(NAME);
		return pattern.matches(NAME, lName);
	}
}
