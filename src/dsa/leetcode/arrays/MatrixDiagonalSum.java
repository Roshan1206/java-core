package dsa.leetcode.arrays;

//https://leetcode.com/problems/matrix-diagonal-sum/description/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] array = {
                {7, 3, 1, 9},
                {3, 4, 6, 9},
                {6, 9, 6, 6},
                {9, 5, 8, 5}
        };
        int[][] array1 = {{5}};
        System.out.println(diagonalSum(array1));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i == j){
                    sum += mat[i][j];
                }
                if(i+j == length-1){
                    sum += mat[i][j];
                }
            }
        }
        if(length%2 == 1 && length > 1){
            int common = (length-1)/2;
            sum = sum - mat[common][common];
        }
        return sum;
    }
}
