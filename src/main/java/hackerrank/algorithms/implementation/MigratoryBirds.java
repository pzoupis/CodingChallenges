package hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Determine which type of bird in a flock occurs at the highest frequency
 *
 * Problem link: https://www.hackerrank.com/challenges/migratory-birds
 */
public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        int birdType = 0;
        int highestFrequency = 0;

        for (int value : arr) {
            Integer temp = hashtable.get(value);
            if (temp == null) {
                hashtable.put(value, 1);
            } else {
                hashtable.put(value, temp + 1);
            }
        }

        for (Map.Entry<Integer, Integer> currentEntry : hashtable.entrySet()) {
            if (currentEntry.getValue() > highestFrequency) {
                highestFrequency = currentEntry.getValue();
                birdType = currentEntry.getKey();
            } else if (currentEntry.getValue() == highestFrequency && currentEntry.getKey() < birdType) {
                birdType = currentEntry.getKey();
            }
        }

        return birdType;
    }
}
