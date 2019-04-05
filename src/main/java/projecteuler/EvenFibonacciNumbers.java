package projecteuler;

/**
 * Problem link: https://projecteuler.net/problem=2
 */
public class EvenFibonacciNumbers {
    public static int evenFibonacciNumbers(int limit) {
        int number1 = 1;
        int number2 = 2;
        int nextNumber = 0;

        int sum = 2;

        while(nextNumber < limit) {
            nextNumber = number1 + number2;
            number1 = number2;
            number2 = nextNumber;
            if (nextNumber % 2 == 0) {
                sum += nextNumber;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenFibonacciNumbers(4_000_000));;
    }
}
