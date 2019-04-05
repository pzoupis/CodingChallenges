package projecteuler;

/**
 * Problem link: https://projecteuler.net/problem=1
 */
public class MultiplesOf3And5 {
    public static int multipleOf3And5(int limit) {
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(multipleOf3And5(1000));
    }
}
