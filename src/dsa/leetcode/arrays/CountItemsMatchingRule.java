package dsa.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/
public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        System.out.println(countMatches2(items, "color", "silver"));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, ruleIndex = 0;

        if(ruleKey.equals("color")){
            ruleIndex = 1;
        }
        if (ruleKey.equals("name")){
            ruleIndex = 2;
        }

        for (List<String> lists : items){
            if(lists.get(ruleIndex).equalsIgnoreCase(ruleValue)){
                count++;
            }
        }

        return count;
    }

    static int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }

        return res;
    }
}
