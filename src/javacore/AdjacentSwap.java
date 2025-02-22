package javacore;

import java.util.Scanner;

class UserMainCodeAdjacentSwap {
	public String swapPairs(String string) {
		String swapedString = "";
		for (int i = 0; i < string.length(); i = i + 2) {
			swapedString = swapedString + string.charAt(i + 1) + string.charAt(i);
		}
		return swapedString;
	}
}

public class AdjacentSwap {

	public static void main(String[] args) {
		UserMainCodeAdjacentSwap userMainCodeAdjacentSwap = new UserMainCodeAdjacentSwap();
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter string : ");
		// String string = scanner.next();
		// scanner.close();
		String string = "New York";

		String swappedString = userMainCodeAdjacentSwap.swapPairs(string);
		System.out.println(swappedString);
	}

}
