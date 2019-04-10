package hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Set;

/**
 * Problem link: https://www.hackerrank.com/challenges/sock-merchant
 */
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            Integer temp = ar[i];
            Integer value = hashtable.get(temp);
            if (value != null) {
                hashtable.put(temp, value + 1);
            } else {
                hashtable.put(temp, 1);
            }
        }

        Set<Integer> set = hashtable.keySet();
        for (Integer i : set) {
            Integer value = hashtable.get(i);
            pairs += (value / 2);
        }
        return pairs;
    }
}
