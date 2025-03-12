package dsa.others;

//Given a sorted array return the target or the smallest number that is greater than target
public class CelingNumber {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 10, 12, 15, 18, 23, 45, 49, 67};
        int target = 46;
        System.out.println(findCeilingNumber(array, target));
    }

    static int findCeilingNumber(int[] array, int target){
        if(target > array[array.length - 1]){
            return -1;
        }

        int start = 0;
        int end = array.length-1;

        while (start < end){
            int mid = start + (end-start)/2;

            if(array[mid] == target){
                return array[mid];
            } else if (array[mid] < target) {
                start = mid + 1;
            }else
                 end = mid - 1;
        }

        return array[start];
    }
}
