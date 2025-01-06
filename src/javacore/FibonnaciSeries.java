package javacore;

public class FibonnaciSeries {
    public static void main(String[] args) {
        FibonnaciSeriesImpl.printFibonnaciSeries(5);
    }
}

class FibonnaciSeriesImpl {
    public static void printFibonnaciSeries(int number){
        int firstNumber = 0;
        int secondNumber = 1;
        int sum;
        System.out.print(firstNumber + ", " + secondNumber + ", ");

        for(int i=0; i<=number; i++){
            sum = firstNumber + secondNumber;
            System.out.print(sum + ", ");
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }
}


