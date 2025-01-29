package leetcode;

public class FindTheDifference {
    public static void main(String[] args) {
        FindTheDifferenceSolution findTheDifferenceSolution = new FindTheDifferenceSolution();
        System.out.println(findTheDifferenceSolution.findTheDifference("abc", "abcd"));
        System.out.println(findTheDifferenceSolution.findTheDifference("", "y"));
        System.out.println(findTheDifferenceSolution.findTheDifference("a", "aa"));
    }
}

class FindTheDifferenceSolution{
    public char findTheDifference(String s, String t){
        int result = 0;
        for (int i = 0; i < s.length(); i++) result ^= s.charAt(i);
        for (int i = 0; i < t.length(); i++) result ^= t.charAt(i);
        return (char) result;
    }
}
