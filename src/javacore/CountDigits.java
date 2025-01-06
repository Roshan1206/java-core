package javacore;

import java.util.ArrayList;
import java.util.Arrays;

public class CountDigits {
    public static void main(String[] args) {
        int number = 53987;
        int length = String.valueOf(number).split("").length;
        System.out.println(length);
    }
}
