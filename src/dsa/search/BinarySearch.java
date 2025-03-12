package dsa.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {8, 18, 34, 56, 65, 85};
        int target = 65;
        int result = doBinarySearch(array, target);

        if(result != -1){
            System.out.println("Item found at : " + result);
        }else{
            System.out.println("Item not found");
        }
    }

//    will only work for sorted array
    static int doBinarySearch(int[] array, int target){
        if (array.length == 0){
            return -1;
        }

        int start = 0;
        int end = array.length - 1;

        boolean isAscending = array[start] < array[end];

        while (start <= end){
//          Calculate the middle index in a way that avoids overflow
            int mid = start + (end-start)/2;

            if(target == array[mid]){
                return mid;
            }

            // Adjust search range based on the sorting order and target's value
            if(isAscending){
                // For ascending order arrays
                if(target < array[mid]){
                    end = mid - 1;  // Narrow the search to the left half
                } else {
                    start = mid + 1;  // Narrow the search to the right half
                }
            } else{
                // For descending order arrays
                if(target > array[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            }
        }
        // Return -1 if the target is not found in the array
        return -1;
    }
}
