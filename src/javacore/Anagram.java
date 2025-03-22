package javacore;

import java.util.*;
import java.util.stream.Collectors;

class UserMainCodeAnagram{
	public int getAnagram(String str1, String str2) {
		if(str1.length() != str2.length()){
			return -1;
		}

		ArrayList<String> splitStr1 = splitStringIntoArrayList(str1);
		ArrayList<String> splitStr2 = splitStringIntoArrayList(str2);
		ArrayList<String> newStrings = new ArrayList<String>();

        for (String string : splitStr1) {
            if (splitStr2.contains(string)) {
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
	
	public ArrayList<String> splitStringIntoArrayList(String str) {
		return Arrays.stream(str.split("")).collect(Collectors.toCollection(ArrayList::new));
	}
}

class Solution{
	public int isAnagram(String s, String t) {
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();

		Arrays.sort(sChars);
		Arrays.sort(tChars);

		return Arrays.equals(sChars, tChars) ? 1 : -1;
	}
}

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCodeAnagram userMainCodeAnagram = new UserMainCodeAnagram();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter 1st string : ");
//		String str1 = scanner.nextLine();
//		System.out.println("Enter 2nd string : ");
//		String str2 = scanner.nextLine();
//		scanner.close();
		String str1 = "eleven plus two";
		String str2 = "twelve plus one";
		int result = userMainCodeAnagram.getAnagram("a", "ab");
		if(result==1) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
    }
}
