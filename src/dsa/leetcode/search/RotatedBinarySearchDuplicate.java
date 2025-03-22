package dsa.leetcode.search;

public class RotatedBinarySearchDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,1,1,1,1,1,1,1};
        int target = 2;
        RotatedBinarySearchDuplicateSolution solution = new RotatedBinarySearchDuplicateSolution();
        boolean ans = solution.search(arr, target);
        System.out.println(ans);
    }

}

class RotatedBinarySearchDuplicateSolution {
    public boolean search(int[] nums, int target) {
//        if (nums[0] == nums[nums.length - 1]) {
//            return searchInRotatedArray(0, nums.length - 1, target, nums);
//        }
        int peak = findPeakIndex(0, nums.length - 1, nums);
        boolean ans = false;

        ans = searchInRotatedArray(0, peak, target, nums);

        if (!ans) {
            ans = searchInRotatedArray(peak + 1, nums.length - 1, target, nums);
        }

        return ans;
    }

    public int findPeakIndex(int start, int end, int[] arr) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
        }
        return -1;
    }

    public boolean searchInRotatedArray(int start, int end, int target, int[] arr) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
