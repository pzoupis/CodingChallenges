package hackerrank.algorithms.implementation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsShopTest {
    @Test
    public void getMoneySpentTest0() {
        int[] keyboards = new int[] { 3, 1 };
        int[] drives = new int[] { 5, 2, 8 };
        int budget = 10;

        int expectedResult = 9;
        int actualResult = ElectronicsShop.getMoneySpent(keyboards, drives, budget);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void getMoneySpentTest1() {
        int[] keyboards = new int[] { 4 };
        int[] drives = new int[] { 5 };
        int budget = 5;

        int expectedResult = -1;
        int actualResult = ElectronicsShop.getMoneySpent(keyboards, drives, budget);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
