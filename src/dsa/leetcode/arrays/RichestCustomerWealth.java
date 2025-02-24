package dsa.leetcode.arrays;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int wealth = 0;

        for(int row = 0; row < accounts.length; row++){
            int rowWealth = 0;
            for(int col = 0; col < accounts[row].length; col++){
                rowWealth += accounts[row][col];
            }
            if(rowWealth > wealth){
                wealth = rowWealth;
            }
        }
        return wealth;
    }
}
