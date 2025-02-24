package dsa.leetcode.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < n; i++){
            arr[(2*i)] = nums[i];
            arr[(2*i)+1] = nums[n+i];
        }
        return arr;
    }
}
