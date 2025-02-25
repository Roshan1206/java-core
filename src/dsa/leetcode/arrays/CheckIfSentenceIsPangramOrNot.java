package dsa.leetcode.arrays;

public class CheckIfSentenceIsPangramOrNot {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        for (int i = 97; i <= 122; i++) {
            char c = (char) i;
            if(!sentence.contains(Character.toString(c))){
                return false;
            }
        }
        return true;
    }
}
