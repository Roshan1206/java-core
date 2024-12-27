package javacore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class UserMainCodeEmployeeBonus{
	@SuppressWarnings("deprecation")
	public static TreeMap<Integer, Integer> calculateRevisedSalary(HashMap<Integer, String> dobMap, HashMap<Integer, Integer> salaryMap) throws ParseException{
		TreeMap<Integer, Integer> revisedSalaryMap = new TreeMap<>();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
		int year = simpleDateFormat.parse("01-09-2014").getYear();
		
		for (Entry<Integer, String> entry : dobMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			int sal = salaryMap.get(key);
			int revisedSal = 0;
			int employeeDate = simpleDateFormat.parse(val).getYear();
			int yearDifference = year-employeeDate;
			
			if(yearDifference>=25 && yearDifference <=30) {
				revisedSal = sal + ((sal*20)/100);
			}else if (yearDifference>=31 && yearDifference <=60) {
				revisedSal = sal + ((sal*30)/100);
			}
			
			revisedSalaryMap.put(key, revisedSal);
		}
		
		return revisedSalaryMap;
	}
}

public class EmployeeBonus {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of employees : ");
		int size = scanner.nextInt();

		HashMap<Integer, String> dOBMap = new HashMap<>();
		HashMap<Integer, Integer> salaryMap = new HashMap<>();
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter ID, DOB, salary :- ");
			int id = scanner.nextInt();
			String dobString = scanner.next();
			int salary = scanner.nextInt();
			
			dOBMap.put(id, dobString);
			salaryMap.put(id, salary);
		}
		
		TreeMap<Integer, Integer> employeeRevisedSalary = new TreeMap<>();
		employeeRevisedSalary = UserMainCodeEmployeeBonus.calculateRevisedSalary(dOBMap, salaryMap);
		
		for (Entry<Integer, Integer> entry : employeeRevisedSalary.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key);
			System.out.println(val);
			
		}
		scanner.close();
	}

}
