package com.blz.emailtest;

import java.util.regex.Pattern;

public class Emailtest {
	private static final String EMAIL_PATTERN = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		return pattern.matches(EMAIL_PATTERN, email);
	}
}
