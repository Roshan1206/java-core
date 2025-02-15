package streams;

import java.util.Arrays;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 444, 67, 88, 34, 23, 56);

//      Print even numbers
        numbers.stream().filter(n -> n%2 ==0 ).toList().forEach(System.out::println);

//      Sum of numbers
        System.out.println("Sum : " + numbers.stream().reduce(0, (a, b)->a+b));
        System.out.println("Sum : " + numbers.stream().reduce(0, Integer::sum));

//        Max number
        System.out.println(numbers.stream().max(Integer::compareTo));
    }
}
