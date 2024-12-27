package javacore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class UserMainCodeFindOldDate{

	public static String findOldDate(String firstDateString, String secondDateString) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat outputDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		
		Date firstDate = inputDateFormat.parse(firstDateString);
		Date secondDate = inputDateFormat.parse(secondDateString);
		
		 String oldDateString="";
		 Date oldDate;
		
		if (firstDate.after(secondDate)) {
			oldDate = secondDate;
		}else {
			oldDate = firstDate;
		}

		
		oldDateString = String.valueOf(outputDateFormat.format(oldDate));
		return oldDateString;
	}
}

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date : ");
		String firstDateString = scanner.next();
		String secondDateString = scanner.next();
		
		String oldDateString = UserMainCodeFindOldDate.findOldDate(firstDateString, secondDateString);
		System.out.println(oldDateString);
		scanner.close();

	}
}
