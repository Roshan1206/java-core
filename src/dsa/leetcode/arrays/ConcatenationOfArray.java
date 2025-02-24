package dsa.leetcode.arrays;

import java.util.Arrays;

/*
* https://leetcode.com/problems/concatenation-of-array/description/
*
* Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
* and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
* Specifically, ans is the concatenation of two nums arrays.
* Return the array ans.
* */
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int num =0 ; num < nums.length ; num++){
            ans[num] = ans[nums.length + num] = nums[num];
        }
        return ans;
    }
}
