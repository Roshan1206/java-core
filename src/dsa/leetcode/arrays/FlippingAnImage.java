package dsa.leetcode.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/description/
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] binaryArray = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] flippedImage = flipAndInvertImage(binaryArray);
//        System.out.println(Arrays.deepToString(flippedImage));
        for (int[] ints : flippedImage) {
            System.out.println(Arrays.toString(ints));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            int startIndex = 0;
            int endIndex = image[row].length;
            for (int col = 0; col < image[row].length; col++) {
                if(startIndex < endIndex){
                    int temp = image[row][col];
                    image[row][col] = image[row][image[row].length-col-1];
                    image[row][image[row].length-col-1] = temp;

                    startIndex++;
                    endIndex--;
                }

                if(image[row][col] == 1){
                    image[row][col] = 0;
                } else{
                    image[row][col] = 1;
                }
            }
        }

        return image;
    }
}
