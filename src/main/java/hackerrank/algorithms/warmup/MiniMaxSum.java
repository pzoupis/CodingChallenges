package hackerrank.algorithms.warmup;

/**
 * Problem link: https://www.hackerrank.com/challenges/mini-max-sum
 */
public class MiniMaxSum {
    public static void miniMaxSum(int[] arr) {
        long miniSum = 0;
        long maxSum = 0;
        int miniNumber = arr[0];
        int maxNumber = arr[0];

        for (int value : arr) {
            miniSum += value;
            maxSum += value;

            if (miniNumber > value) {
                miniNumber = value;
            }

            if (maxNumber < value) {
                maxNumber = value;
            }
        }

        miniSum -= maxNumber;
        maxSum -= miniNumber;

        System.out.println(miniSum + " " + maxSum);
    }
}
