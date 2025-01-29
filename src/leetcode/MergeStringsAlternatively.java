package leetcode;

public class MergeStringsAlternatively {

    public static void main(String[] args) {
        MergeStringsAlternativelySolution mergeStringsAlternativelySolution = new MergeStringsAlternativelySolution();
        System.out.println(mergeStringsAlternativelySolution.mergeAlternatively("abc", "pqr"));
        System.out.println(mergeStringsAlternativelySolution.mergeAlternatively("ab", "pqrs"));
        System.out.println(mergeStringsAlternativelySolution.mergeAlternatively("abcd", "pq"));
    }
}

class MergeStringsAlternativelySolution{
    public String mergeAlternatively(String word1, String word2){
        String alternateString = "";
        String endString = "";
        int len;

        if(word1.length() > word2.length()){
            len = word2.length();
            endString = word1.substring(len);
        } else if (word2.length() > word1.length()) {
            len = word1.length();
            endString = word2.substring(len);
        }else {
            len = word1.length();
        }

        for (int i = 0; i < len; i++) {
            alternateString = alternateString+word1.charAt(i)+word2.charAt(i);
        }

        return alternateString+endString;
    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
