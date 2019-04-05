package projecteuler;

/**
 * Problem link: https://projecteuler.net/problem=3
 */
public class LargestPrimeFactor {
    public static int largestPrimeFactor(long number) {
        int primeFactor = 2;
        while (number > 1) {
            if (number % primeFactor == 0) {
                number = number / primeFactor;
            } else {
                primeFactor++;
            }
        }
        return primeFactor;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }
}
