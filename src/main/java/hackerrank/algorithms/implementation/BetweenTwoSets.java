package hackerrank.algorithms.implementation;

/**
 * Problem link: https://www.hackerrank.com/challenges/between-two-sets
 */
public class BetweenTwoSets {
    public static int getTotalX(int[] a, int[] b) {
        int count = 0;
        for (int i = a[a.length-1]; i <= b[0]; i++) {
            if (checkConditions(a, b, i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean checkConditions(int[]a , int[]b ,int integerBeingConsidered) {
        for (int value : a) {
            if (integerBeingConsidered % value != 0) {
                return false;
            }
        }

        for (int value : b) {
            if (value % integerBeingConsidered != 0) {
                return false;
            }
        }

        return true;
    }
}
