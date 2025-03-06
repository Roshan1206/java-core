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

        boolean isAsc = array[start] < array[end];

        while (start <= end){
//          find the middle element. below one will work for large array size also
            int mid = start + (end-start)/2;

            if(target == array[mid]){
                return mid;
            }

            if(isAsc){
                if(target < array[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            } else{
                if(target > array[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
