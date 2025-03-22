package dsa.leetcode.search;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3};
        int target = 5;
        SearchInRotatedArraySolution solution = new SearchInRotatedArraySolution();
        int ans = solution.search(arr, target);
        System.out.println(ans);
    }
}

class SearchInRotatedArraySolution {
    public int search(int[] nums, int target) {
        int peak = findPeakIndex(0, nums.length - 1, nums);
        int ans = -1;
        ans = searchInRotatedArray(0, peak, target, nums);

        if(ans == -1){
            ans = searchInRotatedArray(peak + 1, nums.length - 1, target, nums);
        }

        return ans;
    }

    public int findPeakIndex(int start, int end, int[] arr){
            int value = 0;
        while(start < end){
            int mid = start + (end - start)/2;
            value = arr[mid];
            if(value > arr[mid + 1]){
                return mid;
            }else{
                if(value > arr[start]){
                    start = mid;
                }else{
                    end = mid;
                }
            }
        }
        return -1;
    }

    public int searchInRotatedArray(int start, int end, int target, int[] arr){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
