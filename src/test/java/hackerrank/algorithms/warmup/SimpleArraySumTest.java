package hackerrank.algorithms.warmup;

import org.testng.Assert;
import org.testng.annotations.Test;

class SimpleArraySumTest {

    @Test
    public void testSimpleArraySum() {
        int[] arr = new int[] { 1, 2, 3, 4, 10, 11 };
        int result = SimpleArraySum.simpleArraySum(arr);
        Assert.assertEquals(31, result);
    }
}
