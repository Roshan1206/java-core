package javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class UserMainCodeAnagram{
	public static int getAnagram(String str1, String str2) {
		ArrayList<String> splitStr1 = splitStringIntoArrayList(str1);
		ArrayList<String> splitStr2 = splitStringIntoArrayList(str2);
		ArrayList<String> newStrings = new ArrayList<String>();
	
		for (Iterator<String> iterator = splitStr1.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if(splitStr2.contains(string)) {
				splitStr2.remove(string);
				newStrings.add(string);
			}
		}
		
		String newString = String.join("", newStrings);
		
		if(str1.equals(newString)) {
			return 1;
		}
		
		return -1;
		
	}
	
	public static ArrayList<String> splitStringIntoArrayList(String str) {
		String[] splitStr = str.split("");
		ArrayList<String> listStrings = new ArrayList<String>
									(Arrays.asList(splitStr));
		return listStrings;
	}
}

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1 = scanner.nextLine();
		System.out.println("Enter 2nd string : ");
		String str2 = scanner.nextLine();
		scanner.close();
//		String str1 = "eleven plus two";
//		String str2 = "twelve plus one";
		int result = UserMainCodeAnagram.getAnagram(str1, str2);
		if(result==1) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}

	}

}
