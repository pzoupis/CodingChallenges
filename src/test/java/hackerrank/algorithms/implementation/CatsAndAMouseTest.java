package hackerrank.algorithms.implementation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CatsAndAMouseTest {

    @Test
    public void testCatAndMouse1() {
        int catA = 1;
        int catB = 2;
        int mouseC = 3;

        String expectedResult = "Cat B";
        String actualResult = CatsAndAMouse.catAndMouse(catA, catB, mouseC);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCatAndMouse2() {
        int catA = 1;
        int catB = 3;
        int mouseC = 2;

        String expectedResult = "Mouse C";
        String actualResult = CatsAndAMouse.catAndMouse(catA, catB, mouseC);

        Assert.assertEquals(actualResult, expectedResult);
    }
}