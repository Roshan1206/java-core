/**
 * Obtain two strings from user as input. 
 * Your program should modify the first string such that all
 * the characters are replaced by plus sign (+), except the 
 * characters that are present in the second string. That is, 
 * if one or more characters of first string appear in second string, 
 * they will not be replaced by plus sign (+). Return the modified 
 * string as output. Note - Ignore case. Include a class UserMainCode 
 * with a static method replacePlus, which accepts two string variables. 
 * The return type is the modified string. Create a Class Main that 
 * would be used to accept two Input strings and call the static method 
 * present in UserMainCode. Input and Output Format: Input consists of 
 * two strings with a maximum size of 100 characters. Output consists of 
 * a single string. Refer the sample output for formatting specifications. 
 * Sample Input 1: abcxyz axdef 
 * Sample Output 1: a++ x++
 * 
 */

package javacore;

import java.util.Scanner;

class UserMainCode {
	public static String replacePlus(String str1, String str2) {
		int i = 0;
		while (i < str1.length()) {
			CharSequence a = str1.substring(i, i + 1);
			if (str2.contains(a)) {
				str1 = str1.replace((String) a, "+");
			}
			i++;

		}
		return str1;
	}
}

public class StringUniqueAndExistingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1 = scanner.nextLine();
		System.out.println("Enter 2nd string : ");
		String str2 = scanner.nextLine();
		scanner.close();
		System.out.println(UserMainCode.replacePlus(str1, str2));

	}

}
