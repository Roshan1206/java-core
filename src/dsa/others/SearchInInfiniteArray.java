package dsa.others;

//You are given an infinite sorted array, and you need to find the index of a target value efficiently. Since the array is "infinite," you cannot use its size in your solution
public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 8, 10, 12, 13, 15, 17, 18, 19, 23, 27, 30};
        int target = 15;
        final int ans = findRange(nums, target);
        System.out.println(ans + " " + nums[ans]);
    }

    static int findRange(int[] nums, int target){
        int start = 0;
        int end = 1;

        while(target > nums[end]){
            int difference = (end - start) * 2;
            start = end + 1;
            end = start + difference;
        }
        return searchInInfiniteArray(nums, target, start, end);
    }

    static int searchInInfiniteArray(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
