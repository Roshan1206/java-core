package udemy;

public class NumberToWord {
	public void numberToWords(int number){
        int newNumber, reverseNumber = reverse(number);
        if(reverseNumber<0){
            System.out.println("Invalid Input");
        }
        System.out.println(reverseNumber);
        
        while(reverseNumber>0){
            newNumber = reverseNumber%10;
            
            switch(newNumber){
                case 0 : System.out.println("Zero");
                        break;
                case 1 : System.out.println("One");
                        break;
                case 2 : System.out.println("Two");
                        break;
                case 3 : System.out.println("Three");
                        break;
                case 4 : System.out.println("Four");
                        break;
                case 5 : System.out.println("Five");
                        break;
                case 6 : System.out.println("Six");
                        break;
                case 7 : System.out.println("Seven");
                        break;
                case 8 : System.out.println("Eight");
                        break;
                case 9 : System.out.println("Nine");
                        break;
                default : System.out.println("Invalid");
                        break;
            }
            reverseNumber = reverseNumber/10;
        }
        
        
    }
    
    public static int reverse(int number){
    	int reverseNumber=0;
        while(number>0){
            reverseNumber = (reverseNumber*10) + (number%10);
            number = number/10;
        }
        return reverseNumber;
    }
    
    public static int getDigitCount(int number){
        int count=0;
        if(number<0){
            return -1;
        }
        while(number>0){
            number = number/10;
            count++;
        }
        return count;
    }
}
