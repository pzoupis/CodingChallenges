package hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem link: https://www.hackerrank.com/challenges/compare-the-triplets
 */
public class CompareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            } else if (a.get(i) < b.get(i)) {
                bobPoints++;
            }
        }
        result.add(alicePoints);
        result.add(bobPoints);
        return result;
    }
}
