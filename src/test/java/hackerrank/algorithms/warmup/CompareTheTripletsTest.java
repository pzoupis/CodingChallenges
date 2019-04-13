package hackerrank.algorithms.warmup;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTripletsTest {
    @Test
    public void compareTripletsTest0() {
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);

        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(1);

        List<Integer> actualResult = CompareTheTriplets.compareTriplets(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void compareTripletsTest1() {
        List<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(99);
        b.add(16);
        b.add(8);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(1);

        List<Integer> actualResult = CompareTheTriplets.compareTriplets(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
