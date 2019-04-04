package hackerrank.algorithms.warmup;

/**
 * Problem link: https://www.hackerrank.com/challenges/birthday-cake-candles
 */
public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(int[] ar) {
        int numberOfTallestCandles = 0;
        int maxHeight = 0;

        for (int value : ar) {
            if (maxHeight < value) {
                maxHeight = value;
                numberOfTallestCandles = 1;
            } else if (maxHeight == value) {
                numberOfTallestCandles++;
            }
        }

        return numberOfTallestCandles;
    }
}
