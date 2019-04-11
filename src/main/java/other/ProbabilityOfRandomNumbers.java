package other;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProbabilityOfRandomNumbers {
    public static void probabilityOfRandomNumbers(int n, int lowerBound, int upperBound) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Random random = new Random();
        float total = 0;

        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            hashMap.merge(randomNumber, 1, (a, b) -> a + b);
        }
        System.out.println(hashMap);

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + (float) entry.getValue() / n * 100 + "%");
            total += (float) entry.getValue() / n * 100;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        probabilityOfRandomNumbers(100000, -5, 5);
    }
}
