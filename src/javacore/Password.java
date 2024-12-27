package javacore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserMainCodePassword{
	public static boolean validatePassword(String string) {
		Pattern lettersPattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
		Pattern digitsPattern = Pattern.compile("[0-9]");
		Pattern specialCharcterPattern = Pattern.compile("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]");
		
		Matcher hasLetterMatcher = lettersPattern.matcher(string);
		Matcher hasDigitsMatcher = digitsPattern.matcher(string);
		Matcher hasSpecialCharcterMatcher = specialCharcterPattern.matcher(string);
		
		if(string.length()>=8) {
			return hasLetterMatcher.find() && hasDigitsMatcher.find() && hasSpecialCharcterMatcher.find();
		}
		
		return false;
	}
}

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "punitha3";
		
		if (UserMainCodePassword.validatePassword(string)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
