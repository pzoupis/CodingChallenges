package hackerrank.algorithms.implementation;

/**
 * Count the valleys encountered during vacation
 *
 * Problem link: https://www.hackerrank.com/challenges/counting-valleys
 */
public class CountingValleys {
    public static int countingValleys(int n, String s) {
        int numberOfValleys = 0;
        int currentLevel = 0;
        int previousLevel = 0;

        for (int i = 0; i < n; i++) {
            previousLevel = currentLevel;

            if (s.charAt(i) == 'U') {
                currentLevel++;
            } else {
                currentLevel--;
            }

            if (previousLevel == 0 && currentLevel == -1) {
                numberOfValleys++;
            }
        }
        return numberOfValleys;
    }
}
