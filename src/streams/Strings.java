package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Strings {
    public static void main(String[] args) {
//        Remove Duplicate Elements from a List:
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> distincList = listOfStrings.stream().distinct().toList();
        System.out.println(distincList);

//        Find Frequency of Each Character in a String:
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> charCount = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);

        String checkPalindrone = "wow";
        char[] charArray = checkPalindrone.toCharArray();
        char[] charPalindrone = new char[charArray.length];
        int start = 0;
        int end = charArray.length - 1;

        while (start <= end){
            charPalindrone[start] = charArray[end];
            charPalindrone[end] = charArray[start];
            start++;
            end--;
        }

        String reverseStr = String.valueOf(charPalindrone);
        if(reverseStr.equals(checkPalindrone)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
