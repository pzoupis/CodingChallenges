package hackerrank.algorithms.implementation;

/**
 * Problem link: https://www.hackerrank.com/challenges/kangaroo
 */
public class Kangaroo {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 != x2 && v1 == v2) {
            return "NO";
        }

        float numberOfJumps = (float) (x2 - x1) / (v1 - v2);
        if (Math.ceil(numberOfJumps) == numberOfJumps && numberOfJumps >= 0) {
            return "YES";
        }

        return "NO";
    }
}
