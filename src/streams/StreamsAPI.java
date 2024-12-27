package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

public class StreamsAPI {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,5,3,8,4,7,5);
		
		List<Integer> sortedList = numbers.stream()
				.sorted().collect(Collectors.toList());
		
		List<Integer> distinctList = sortedList.stream()
				.distinct().collect(Collectors.toList());
		
		List<Integer> squareOfNumbers = distinctList.stream()
				.map(x->x*x).collect(Collectors.toList());
		
		List<Integer> evenList = squareOfNumbers.stream()
				.filter(i->(i%2==0)).collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(sortedList);
		System.out.println(distinctList);
		System.out.println(squareOfNumbers);
		System.out.println(evenList);

	}

}
