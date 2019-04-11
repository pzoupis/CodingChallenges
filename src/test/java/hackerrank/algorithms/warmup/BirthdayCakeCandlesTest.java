package hackerrank.algorithms.warmup;

import org.testng.Assert;
import org.testng.annotations.Test;

class BirthdayCakeCandlesTest {

    @Test
    public void birthdayCakeCandles() {
        int[] arr = new int[] { 3, 2, 1, 3 };
        int result = BirthdayCakeCandles.birthdayCakeCandles(arr);
        Assert.assertEquals(2, result);
    }
}
