package hackerrank.algorithms.warmup;

/**
 * Problem link: https://www.hackerrank.com/challenges/diagonal-difference
 */
public class DiagonalDifference {
    public static int diagonalDifference(int[][] arr) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int diagonalDifference = 0;

        for (int i = 0, j = arr[0].length - 1; i < arr.length; i++, j--) {
            primaryDiagonal += arr[i][i];
            secondaryDiagonal += arr[i][j];
        }

        diagonalDifference = Math.abs(primaryDiagonal - secondaryDiagonal);
        return diagonalDifference;
    }
}
