package javacore;

import java.util.Scanner;

class UserMainCodeMaximumDifference{
	public static int findMaxDifference(int intArray[]) {
		int diff=0, newDiff=0, index=0;
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] > intArray[i+1]) {
				diff = findDifference(intArray[i], intArray[i+1]);
			}else {
				diff = findDifference(intArray[i+1], intArray[i]);
			}
			
			if(diff>newDiff) {
				newDiff=diff;
				if (intArray[i] > intArray[i+1]) {
					index=i;
				}else {
					index=i+1;
				}
			}
		}
		return index;
	}
	
	public static int findDifference(int num1, int num2) {
		return num1-num2;
	}
}

public class MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] intArray  =new int[n];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			System.out.println(i);
		}
		
		int output = UserMainCodeMaximumDifference.findMaxDifference(intArray);
		scanner.close();
	}

}
