package javacore;

public class PrimeNumber {
    public static void main(String[] args) {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        int number = 17;

        if(checkPrimeNumber.isPrime(number)){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}

class CheckPrimeNumber{
    public boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
