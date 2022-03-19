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
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	private static final String PHONE = "^[9]{1}[1]{1}[ ]?[6-9]{1}[0-9]{9}$";

	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(NAME);
		return pattern.matches(NAME, fname);
	}

//enter a valid LastName
	public boolean validateLastName(String lName) {
		Pattern pattern = Pattern.compile(NAME);
		return pattern.matches(NAME, lName);
	}

	// ValidEmail
	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		return pattern.matches(EMAIL_PATTERN, email);
	}

//ValidPhoneNumber
	public boolean validatePhoneNumber(String phNumber) {
		Pattern pattern = Pattern.compile(PHONE);
		return pattern.matches(PHONE, phNumber);
	}
}
