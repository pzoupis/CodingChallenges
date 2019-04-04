package hackerrank.algorithms.warmup;

/**
 * Problem link: https://www.hackerrank.com/challenges/simple-array-sum
 */
public class SimpleArraySum {
    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int value : ar) {
            sum += value;
        }
        return sum;
    }
}
