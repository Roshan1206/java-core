package dsa.leetcode.arrays;


/*
* https://leetcode.com/problems/running-sum-of-1d-array/description/
*
* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
* Return the running sum of nums.
*/

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = nums[0];
        ans[0] = sum;

        for (int num = 0; num < nums.length-1; num++) {
            sum += nums[num+1];
            ans[num+1] = sum;
        }

        return ans;
    }
}
