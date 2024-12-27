package javacore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class UserMainCodeRetirement{
	@SuppressWarnings("deprecation")
	public static ArrayList<String> retirementEmployeeListArrayList(HashMap<String, String> retirementEmployeeList) throws ParseException {
		ArrayList<String> eligibePersonList = new ArrayList<>();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date currentDate = simpleDateFormat.parse("01/01/2014");
		for (Entry<String, String> entry : retirementEmployeeList.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			Date valDate = simpleDateFormat.parse(val);
			if(currentDate.getYear()-valDate.getYear()>=60) {
				eligibePersonList.add(key);
			}
			
			
		}
		
		return eligibePersonList;
	}
}

public class Retirement {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		HashMap<String, String> retirementEmployeeList = new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		int length = scanner.nextInt();
		
		for(int i=0; i<length; i++) {
			System.out.println("Enter key : ");
			String key = scanner.next();
			System.out.println("Enter value : ");
			String value = scanner.next();
			retirementEmployeeList.put(key, value);
		}
		
		scanner.close();
//		retirementEmployeeList.put("C1010","02/11/1987");
//		retirementEmployeeList.put("C2020","15/02/1980");
//		retirementEmployeeList.put("C3030","14/12/1952");
//		retirementEmployeeList.put("T4040","20/02/1950");
		
		ArrayList<String> employeeIDList = new ArrayList<>();
		employeeIDList = UserMainCodeRetirement.retirementEmployeeListArrayList(retirementEmployeeList);
		
		System.out.println(employeeIDList);
//		for (String string : employeeIDList) {
//			System.out.println(string);
//		}
	}

}
