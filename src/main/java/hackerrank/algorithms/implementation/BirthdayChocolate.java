package hackerrank.algorithms.implementation;

import java.util.List;

/**
 * Given an array of integers, find the number of sub-arrays of length k having sum s.
 *
 * Problem link: https://www.hackerrank.com/challenges/the-birthday-bar
 */
public class BirthdayChocolate {
    public static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int pieces = 0;
        int result = 0;

        for (int i = 0; i < s.size(); i++) {

            for (int j = i; j < i + m; j++) {
                if (j < s.size()) {
                    pieces++;
                    sum += s.get(j);
                }
            }

            if (pieces == m && sum == d) {
                result++;
            }

            pieces = 0;
            sum = 0;
        }

        return result;
    }
}
