package javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class UserMainCodeVowel{
	public static String storeMaxVowelWord(String string) {
		String vowelString = "aeiouAEIOU";
		String[] strings = string.split(" ");
		String[] vowelStrings = vowelString.split("");
		ArrayList<String> stringList = new ArrayList<>(Arrays.asList(strings));
		ArrayList<String> vowelList = new ArrayList<>(Arrays.asList(vowelStrings));
		
		int maxCount=0;
		String maxVowelString = "";
		for (String string2 : stringList) {
			int count=0;
			String[] charStrings = string2.split(""); 
			for (String string3 : charStrings) {
				if(vowelList.contains(string3)) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxVowelString=string2;
			}
		}
		
		return maxVowelString;
	}
}

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		String string = "What is your name?";
		String string = scanner.next();
		scanner.close();
		
		String maxVowelString = UserMainCodeVowel.storeMaxVowelWord(string);
		System.out.println(maxVowelString);

	}

}
