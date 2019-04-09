package hackerrank.algorithms.implementation;

/**
 * Count the number of pairs in an array having sums that are evenly divisible by a given number
 *
 * Problem link: https://www.hackerrank.com/challenges/divisible-sum-pairs
 */
public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
