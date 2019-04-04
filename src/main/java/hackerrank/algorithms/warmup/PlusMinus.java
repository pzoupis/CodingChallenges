package hackerrank.algorithms.warmup;

/**
 * Problem link: https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus {
    public static void plusMinus(int[] arr) {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeros = 0;

        for (int value : arr) {
            if (value > 0) {
                positiveNumbers++;
            } else if (value < 0) {
                negativeNumbers++;
            } else {
                zeros++;
            }
        }

        System.out.println((float) positiveNumbers/arr.length);
        System.out.println((float) negativeNumbers/arr.length);
        System.out.println((float) zeros/arr.length);
    }
}
