package hackerrank.algorithms.implementation;

/**
 * How many pages does Brie need to turn to get to page p?
 *
 * Problem link: https://www.hackerrank.com/challenges/drawing-book
 */
public class DrawingBook {
    public static int pageCount(int n, int p) {
        int result = 0;
        int numberOfPageTurnsFromTheBeginning = p / 2;
        int numberOfPageTurnsToTheEnd = n / 2;
        int difference = numberOfPageTurnsToTheEnd - numberOfPageTurnsFromTheBeginning;
        if (difference > numberOfPageTurnsFromTheBeginning) {
            result = numberOfPageTurnsFromTheBeginning;
        } else {
            result = difference;
        }
        return result;
    }
}
