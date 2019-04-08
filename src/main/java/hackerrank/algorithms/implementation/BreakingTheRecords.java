package hackerrank.algorithms.implementation;

/**
 * Problem link: https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */
public class BreakingTheRecords {
    public static int[] breakingRecords(int[] scores) {
        int[] breaks = new int[] { 0, 0 };
        int lowestScore = scores[0];
        int highestScore = scores[0];

        for (int score : scores) {
            if (score < lowestScore) {
                lowestScore = score;
                breaks[1]++;
            }

            if (score > highestScore) {
                highestScore = score;
                breaks[0]++;
            }
        }
        return breaks;
    }
}
