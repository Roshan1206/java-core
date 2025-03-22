package dsa.leetcode.search;

public class FindMinInRotatedArray {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findMin2(arr));
    }

    static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if(end == 0){
            return arr[start];
        }

        if(arr[start] < arr[end]){
            return arr[start];
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid != 0 && arr[mid] < arr[mid - 1]){
                return arr[mid];
            }else if(arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findMin2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}
