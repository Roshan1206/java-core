package dsa.leetcode.search;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        if(nums.length == 0){
            return result;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                end = mid - 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        result[0] = start;

        start = 0;
        end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        result[1] = end;

        return result;
    }
}
