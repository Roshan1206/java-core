package javacore;

import java.util.Scanner;

class UserMainCodeStringOccurences{
	public static int countNoOfWords(String str1, String str2) {
		String[] str1Array = splitStrings(str1);
		String[] str2Array = splitStrings(str2);
		String secondWordOfStr2 = str2Array[1];
		int count=0;
		for (int i = 0; i < str1Array.length; i++) {
			if(str1Array[i].equals(secondWordOfStr2)) {
				count++;
			}
		}
		return count;
	}
	
	public static String[] splitStrings(String str) {
		String[] strArray = str.split(" ");
		return strArray;
	}
}

public class StringOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1 = scanner.nextLine();
		System.out.println("Enter 2nd string : ");
		String str2 = scanner.nextLine();
		scanner.close();
//		String str1 = "abc bcd abc bcd abc abc";
//		String str2 = "av abc";
		System.out.println(UserMainCodeStringOccurences.countNoOfWords(str1, str2));

	}

}
