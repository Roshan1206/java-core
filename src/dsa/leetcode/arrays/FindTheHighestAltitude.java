package dsa.leetcode.arrays;

//https://leetcode.com/problems/find-the-highest-altitude/
public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gains = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gains));
    }

    static int largestAltitude(int[] gain) {
        int highestPoint = 0, altitude = 0;
        for (int i : gain) {
            altitude += i;
            if(highestPoint < altitude){
                highestPoint = altitude;
            }
        }
        return highestPoint;
    }
}
