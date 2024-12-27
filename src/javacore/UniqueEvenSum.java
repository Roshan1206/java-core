package javacore;

import java.util.Scanner;

class UserMainCode2{
	public static int addUniqueEven(int numbers[]) {
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2==0) {
				sum += numbers[i];
			}
		}
		if(sum==0) {
			return -1;
		}
		return sum;
	}
}

public class UniqueEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length : ");
		int arrayLength = scanner.nextInt();
		int[] numbers = new int[arrayLength];
		System.out.println("Enter arrays : ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		scanner.close();
		int sum = UserMainCode2.addUniqueEven(numbers);
		if(sum==-1) {
			System.out.println("No even numbers");
		}else {
			System.out.println(sum);
		}
	}

}
