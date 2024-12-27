package javacore;

import java.util.Scanner;

class UserMainCodeAdjacentSwap{
	public static String swapPairs(String string) {
		String swapedString="";
		for (int i = 0; i < string.length(); i=i+2) {
			swapedString = swapedString + string.charAt(i+1) + string.charAt(i); 
		}
		return swapedString;
	}
}

public class AdjacentSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter string : ");
//		String string = scanner.next();
//		scanner.close();
		String string = "New York";
		
		String swappedString = UserMainCodeAdjacentSwap.swapPairs(string);
		System.out.println(swappedString);
	}

}
