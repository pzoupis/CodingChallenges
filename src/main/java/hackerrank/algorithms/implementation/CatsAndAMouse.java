package hackerrank.algorithms.implementation;

/**
 * Which cat will catch the mouse first?
 * <p>
 * Problem link: https://www.hackerrank.com/challenges/cats-and-a-mouse
 */
public class CatsAndAMouse {
    public static String catAndMouse(int x, int y, int z) {
        String result = "";
        int differenceA = Math.abs(z - x);
        int differenceB = Math.abs(z - y);
        if (differenceA == differenceB) {
            result = "Mouse C";
        } else if (differenceA < differenceB) {
            result = "Cat A";
        } else {
            result = "Cat B";
        }
        return result;
    }
}
