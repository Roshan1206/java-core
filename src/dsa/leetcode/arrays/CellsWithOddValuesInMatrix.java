package dsa.leetcode.arrays;

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class CellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(2, 3, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
         int count=0;
         int[][] arr =new int[m][n];

//        For each index pair (r, c) in indices:
         for(int i=0;i<indices.length;i++){
             int r=indices[i][0];
             int c=indices[i][1];
//             Increment all elements in row r.
             for(int j=0;j<n;j++){
                 arr[r][j]++;
             }

//            Increment all elements in column c.
             for(int j=0;j<m;j++){
                 arr[j][c]++;
             }
         }
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 if(arr[i][j]%2!=0){
                     count++;
                 }
             }
         }
         return count;
    }
}
