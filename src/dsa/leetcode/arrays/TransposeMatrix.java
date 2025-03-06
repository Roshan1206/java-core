package dsa.leetcode.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    static int[][] transpose(int[][] matrix) {
        final int cols = matrix[0].length;
        final int rows = matrix.length;
        int[][] transposedMatrix = new int[cols][rows];

        for(int mRow = 0; mRow < rows; mRow++){
            for(int mCol = 0; mCol < cols; mCol++){
                transposedMatrix[mCol][mRow] = matrix[mRow][mCol];
            }
        }

        return transposedMatrix;
    }
}
