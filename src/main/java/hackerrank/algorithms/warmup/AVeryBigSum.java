package hackerrank.algorithms.warmup;

/**
 * Problem link: https://www.hackerrank.com/challenges/a-very-big-sum
 */
public class AVeryBigSum {
    public static long aVeryBigSum(long[] ar) {
        long sum = 0;

        for (long value : ar) {
            sum += value;
        }

        return sum;
    }
}
