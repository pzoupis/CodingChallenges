package hackerrank.algorithms.implementation;

/**
 * Determine the most expensive Keyboard and USB drive combination Monica can purchase within her budget
 *
 * Problem link:
 */
public class ElectronicsShop {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int mostExpensiveCombination = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int currentCombination = keyboards[i] + drives[j];
                if (currentCombination <= b && currentCombination > mostExpensiveCombination) {
                    mostExpensiveCombination = currentCombination;
                }
            }
        }
        return mostExpensiveCombination;
    }
}
