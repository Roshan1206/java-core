package javacore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class UserMainCodeArrayListAndSetOperation {
	public static ArrayList<Integer> performSetOperation(ArrayList<Integer> list1, ArrayList<Integer> list2,
			int operation) {
		HashSet<Integer> set1 = new HashSet<>(list1);
		HashSet<Integer> set2 = new HashSet<>(list2);
		HashSet<Integer> finalHashSet = new HashSet<>(set1);

		switch (operation) {
			// set union
			case 1:
				finalHashSet.addAll(set2);
				break;
			// set intersection
			case 2:
				finalHashSet.retainAll(set2);
				break;
			// set difference
			case 3:
				finalHashSet.removeAll(set2);
				break;
			default:
				break;
		}
		ArrayList<Integer> resultArrayList = new ArrayList<>(finalHashSet);
		// resultArrayList =
		return resultArrayList;
	}
}

public class ArrayListAndSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		// char operation = '-';

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = scanner.nextInt();

		System.out.println("Enter values for list1 :-");
		for (int i = 0; i < size; i++) {
			int value = scanner.nextInt();
			list1.add(value);
		}

		System.out.println("Enter values for list2 :-");
		for (int i = 0; i < size; i++) {
			int value = scanner.nextInt();
			list2.add(value);
		}

		System.out.println("Choose operation :");
		System.out.println("	1: Union");
		System.out.println("	1: Intersection");
		System.out.println("	1: Difference");
		int operation = scanner.nextInt();

		scanner.close();

		ArrayList<Integer> resultArrayList = UserMainCodeArrayListAndSetOperation.performSetOperation(list1, list2,
				operation);
		for (Integer integer : resultArrayList) {
			System.out.println(integer);
		}
	}
}
