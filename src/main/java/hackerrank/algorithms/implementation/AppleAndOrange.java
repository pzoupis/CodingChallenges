package hackerrank.algorithms.implementation;

/**
 * Problem link: https://www.hackerrank.com/challenges/apple-and-orange
 */
public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples = countFruits(s, t, a, apples);
        int countOranges = countFruits(s, t, b, oranges);

        System.out.println(countApples);
        System.out.println(countOranges);
    }

    private static int countFruits(int s, int t, int treePosition, int[] fruits) {
        int fruitCounter = 0;
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] += treePosition;
            if (fruits[i] >= s && fruits[i] <= t) {
                fruitCounter++;
            }
        }
        return fruitCounter;
    }
}
