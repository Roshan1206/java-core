package dsa.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class KidsWithTheGreatesNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleans = new ArrayList<Boolean>();
//        int max = 0;
        OptionalInt max = Arrays.stream(candies).max();
//        for (int i = 0; i < candies.length; i++) {
//            if(max < candies[i]){
//                max = candies[i];
//            }
//        }
        for (int candy : candies) {
            if (candy + extraCandies >= max.getAsInt()) {
                booleans.add(true);
            } else {
                booleans.add(false);
            }
        }
        return booleans;
    }
}
