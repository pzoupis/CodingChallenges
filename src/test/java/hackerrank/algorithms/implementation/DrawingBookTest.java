package hackerrank.algorithms.implementation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DrawingBookTest {
    @Test
    public void pageCountTest0() {
        int numberOfPages = 6;
        int page = 2;
        int expectedResult = 1;
        int actualResult = DrawingBook.pageCount(numberOfPages, page);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void pageCountTest1() {
        int numberOfPages = 5;
        int page = 4;
        int expectedResult = 0;
        int actualResult = DrawingBook.pageCount(numberOfPages, page);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
