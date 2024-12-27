package javacore;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class UserMainCodeMasteringHaspMap{
	static int getAverageOfOdd(HashMap<Integer, Integer> map) {
		int sumOfValue=0, count=0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(key%2!=0) {
				sumOfValue = sumOfValue + val;
				count++;
			}
			
		}
		return ((sumOfValue)/count);		
	}
}

public class MasteringHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		System.out.println("Enter length : ");
		int length = scanner.nextInt();
		
		for (int i = 0; i < length; i++) {
			System.out.println("Enter key : ");
			int key = scanner.nextInt();
			System.out.println("Enter value : ");
			int value = scanner.nextInt();
			map.put(key, value);
		}
		
		int average = UserMainCodeMasteringHaspMap.getAverageOfOdd(map);
		System.out.println(average);
		
		scanner.close();
		
	}

}
