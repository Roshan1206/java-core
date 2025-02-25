package dsa.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }


    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
