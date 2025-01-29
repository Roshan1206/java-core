package leetcode;

/*
Given two strings needle and haystack,
return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.
*/

public class IndexOfFirstOccurenceOfString {
    public static void main(String[] args) {
        IndexOfFirstOccurenceOfStringSolution indexOfFirstOccurenceOfStringSolution = new IndexOfFirstOccurenceOfStringSolution();
        System.out.println(indexOfFirstOccurenceOfStringSolution.strStr("sadbutsad", "sad"));
        System.out.println(indexOfFirstOccurenceOfStringSolution.strStr("leetcode", "leeto"));
    }
}

class IndexOfFirstOccurenceOfStringSolution{
    public int strStr(String haystack, String needle){
        return haystack.contains(needle) ? haystack.indexOf(needle) : -1;
    }
}
