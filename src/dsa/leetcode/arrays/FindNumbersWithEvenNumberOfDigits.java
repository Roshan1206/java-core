package dsa.leetcode.arrays;

import java.util.Arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int num){
        String stringValue = String.valueOf(num);
        return stringValue.length() % 2 == 0;
    }

    public static int findNumbers2(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int isOdd = ((int) Math.log10(num) % 2);
            if (isOdd == 1) {
                count++;
            }
        }

        return count;
    }
}
