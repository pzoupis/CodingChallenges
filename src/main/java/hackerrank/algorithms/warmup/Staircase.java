package hackerrank.algorithms.warmup;

/**
 * Problem link: https://www.hackerrank.com/challenges/staircase
 */
public class Staircase {
    public static void staircase(int n) {
        String symbolToPrint = "#";
        String whitespace = " ";

        for (int i = 1; i <= n; i++) {
            // print the spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(whitespace);
            }

            // print the symbol
            for (int j = 0; j < i; j++) {
                System.out.print(symbolToPrint);
            }

            // change line
            System.out.println();
        }
    }
}
