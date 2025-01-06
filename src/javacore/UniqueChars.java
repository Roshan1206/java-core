package javacore;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueChars {
    public static void main(String[] args) {
        String string = "ppdaeef";
        Set<String> unique = Arrays.stream(string.split("")).distinct().collect(Collectors.toSet());
        System.out.println(unique);

    }
}
