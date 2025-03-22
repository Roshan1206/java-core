package javacore;

import java.util.Scanner;

class UserMainCodeArrayListManipulation{
	public static int[] generateOddEvenList(int list1[], int list2[]) {
		int[] oddEvenList= new int[list1.length];
		
		for (int i = 0; i < list1.length; i++) {
			if(i % 2 == 0) {
				oddEvenList[i] = list2[i];
			}else {
				oddEvenList[i] = list1[i];
			}
		}
		return oddEvenList;
	}
}

public class ArrayListManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int length = scanner.nextInt();
		int[] list1 = new int[length];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = scanner.nextInt();
		}

		int[] list2 = new int[length];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = scanner.nextInt();
		}
		
		int[] oddEvenList = UserMainCodeArrayListManipulation.generateOddEvenList(list1, list2);
		
		for (int i = 0; i < oddEvenList.length; i++) {
			System.out.println(oddEvenList[i]);
		}
		scanner.close();
	}

}
