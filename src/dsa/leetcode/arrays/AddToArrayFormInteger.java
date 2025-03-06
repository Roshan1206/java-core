package dsa.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddToArrayFormInteger {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
    }

    public static List<Integer> addToArrayForm(int[] num, int K) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + K) % 10);
            K = (num[i] + K) / 10;
        }
        while (K > 0) {
            res.addFirst(K % 10);
            K /= 10;
        }
        return res;
    }
}
