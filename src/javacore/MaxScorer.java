package javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

class UserMainCodeMaxScorer{
	public static String highestScorer(ArrayList<String> arrayList) {
		HashMap<String, Integer> nameAndScoreMap = new HashMap<String, Integer>();
		
		for (Iterator<String> iterator = arrayList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			ArrayList<String> newArrayList = new ArrayList<String>(Arrays.asList(string.split("-")));
			String nameString = newArrayList.get(0);
			
			int sum=0;
			for (int i = 1; i < newArrayList.size(); i++) {
				int score = Integer.valueOf(newArrayList.get(i));
				sum = sum+score;
			}
			
			nameAndScoreMap.put(nameString, sum);
		}
		
		int maxScore=0;
		String resultString="";
		for (Entry<String, Integer> entry : nameAndScoreMap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			if (val>maxScore) {
				maxScore=val;
				resultString=key;
			}
			
		}
		return resultString;
	}
}

public class MaxScorer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<>();
		
		System.out.println("Enter size : ");
		int size = scanner.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter string in name-mark1-mark2-mark3 pattern : ");
			String string = scanner.next();
			arrayList.add(string);
		}
		
		scanner.close();
		
//		arrayList.add("sunil-56-88-23");
//		arrayList.add("bindul-88-70-10");
//		arrayList.add("john-70-49-65");
		
		String resultString = UserMainCodeMaxScorer.highestScorer(arrayList);
		System.out.println(resultString);
	}
}
