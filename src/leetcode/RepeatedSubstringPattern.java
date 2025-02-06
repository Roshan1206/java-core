package leetcode;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        RepeatedSubstringPatternSolution repeatedSubstringPatternSolution = new RepeatedSubstringPatternSolution();
        if(repeatedSubstringPatternSolution.repeatedSubstringPattern1("aabaaba")){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}

class RepeatedSubstringPatternSolution{
    public boolean repeatedSubstringPattern(String s){
        if(s.length()==1){
            return false;
        }
        int firstIndex = s.indexOf(s.charAt(0), 1);
        String subStr = s.substring(0, firstIndex);
        while (firstIndex <= s.length()){
            s = s.replaceFirst(subStr, "");
            if(firstIndex == s.length()){
                return s.equalsIgnoreCase(subStr);
            }
        }
        return false;
    }

    public boolean repeatedSubstringPattern1(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }

    public void moveZeroes(int[] nums) {
        
    }
}
