package javacore;

class UserMainCodeKaprekarNumber{
	public static int getKaprekarNumber(int number) {
		String numberString = String.valueOf(number);
		String[] sepratedNumStrings = numberString.split("");
		int numberSquared = number*number;
		String squaredString = String.valueOf(numberSquared);
		String[] sepratedSquaredStrings = squaredString.split("");
		String finalString = String.join("", sepratedSquaredStrings);
		String rightString = squaredString.substring(sepratedNumStrings.length,	sepratedSquaredStrings.length);
		String leftString;
		if(sepratedSquaredStrings.length%2 == 0) {
			leftString = finalString.substring(0, (sepratedSquaredStrings.length)/2);
		}else {
			leftString = finalString.substring(0, ((sepratedSquaredStrings.length)/2-1));
		}
		int rightValue = Integer.valueOf(rightString);
		int leftValue = Integer.valueOf(leftString);
//		System.out.println(rightValue);
//		System.out.println(leftValue);
//		System.out.println(numberSquared);
//		System.out.println(number);
		int sum = rightValue+leftValue;
		if (sum==number) {
			return 1;
		}
		return -1;
	}
}

public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = UserMainCodeKaprekarNumber.getKaprekarNumber(9);
		
		if(result==1) {
			System.out.println("Kaperkar Number");
		}else {
			System.out.println("Not Kaperkar number");
		}
		
	}

}
