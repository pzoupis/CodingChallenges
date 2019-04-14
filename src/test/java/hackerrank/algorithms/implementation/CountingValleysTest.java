package hackerrank.algorithms.implementation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountingValleysTest {
    @Test
    public void countingValleysTest0() {
        int steps = 8;
        String path = "UDDDUDUU";

        int expectedResult = 1;
        int actualResult = CountingValleys.countingValleys(steps, path);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countingValleysTest1() {
        int steps = 12;
        String path = "DDUUDDUDUUUD";

        int expectedResult = 2;
        int actualResult = CountingValleys.countingValleys(steps, path);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
