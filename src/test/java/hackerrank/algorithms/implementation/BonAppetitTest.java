package hackerrank.algorithms.implementation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BonAppetitTest {
    private ByteArrayOutputStream outContent;

    @BeforeMethod
    public void beforeTest() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterMethod
    public void afterTest() {
        System.setOut(System.out);
    }

    @Test
    public void bonAppetitTest0() {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        int k = 1;
        int b = 12;

        String expectedResult = "5";

        BonAppetit.bonAppetit(bill, k, b);
        String actualResult = outContent.toString();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void bonAppetitTest1() {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        int k = 1;
        int b = 7;

        String expectedResult = "Bon Appetit";

        BonAppetit.bonAppetit(bill, k, b);
        String actualResult = outContent.toString();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
