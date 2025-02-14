package streams;

import java.util.*;
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

		final List<String> skillSet1 = Arrays.asList("Java", "Spring", "SpringBoot");
		final List<String> skillSet2 = Arrays.asList("HTML", "CSS", "Angular");
		final List<String> skillSet3 = Arrays.asList("MySQL", "MongoDB", "PostgresSQL");

		List<List<String>> skillsLists = Arrays.asList(skillSet1, skillSet2, skillSet3);
		List<String> skillsList = skillsLists.stream().flatMap(Collection::stream).toList();
		List<String> skillStartingWithS = skillsList.stream().filter(skill -> skill.startsWith("S")).toList();
		
//		System.out.println(numbers);
//		System.out.println(sortedList);
//		System.out.println(distinctList);
//		System.out.println(squareOfNumbers);
//		System.out.println(evenList);
		System.out.println(skillsList);
		System.out.println(skillStartingWithS);

	}

}
