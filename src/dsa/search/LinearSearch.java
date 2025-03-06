package dsa.search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {8, 89, 34, 56, 21, 85};
        int[][] array2D = {{8, 89, 34}, {56, 21, 85}};
        int target = 21;
        printResult(doLinearSearch(array, target));
        printResult(doLinearSearchIn2D(array2D, target));
    }

    static void printResult(int[] targetIndex) {
        if (targetIndex[0] == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println( "Item found at : " + Arrays.toString(targetIndex));
        }
    }

    static int[] doLinearSearch(int[] array, int target){
        int length = array.length;
        int[] itemPosition = {-1};
        if(length == 0){
            return itemPosition;
        }

        for (int i = 0; i < length; i++) {
            if (array[i] == target){
                itemPosition[0] = i;
                return itemPosition;
            }
        }
        return itemPosition;
    }

    static int[] doLinearSearchIn2D(int[][] array, int target){
        int[] itemPosition = {-1, -1};
        int rowLength = array.length;

        if(rowLength == 0){
            return itemPosition;
        }

        for (int row = 0; row < rowLength; row++) {
            int[] res = doLinearSearch(array[row], target);
            if(res[0] != -1){
                itemPosition[0] = row;
                itemPosition[1] = res[0];
                return itemPosition;
            }
        }

        return itemPosition;
    }
}
